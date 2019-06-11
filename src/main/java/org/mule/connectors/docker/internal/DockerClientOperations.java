package org.mule.connectors.docker.internal;

import static com.github.dockerjava.api.model.HostConfig.newHostConfig;
import static java.lang.Integer.*;
import static org.apache.commons.lang.CharEncoding.UTF_8;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.command.CreateContainerCmd;
import com.github.dockerjava.api.command.ExecCreateCmdResponse;
import com.github.dockerjava.api.exception.NotModifiedException;
import com.github.dockerjava.api.model.Bind;
import com.github.dockerjava.api.model.ExposedPort;
import com.github.dockerjava.api.model.HostConfig;
import com.github.dockerjava.api.model.Ports;
import com.github.dockerjava.api.model.Volume;
import com.github.dockerjava.core.command.ExecStartResultCallback;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.mule.connectors.docker.error.DockerRuntimeException;
import org.mule.connectors.docker.operations.CreateContainerParams;

public class DockerClientOperations {

  private final DockerClient client;

  public DockerClientOperations(DockerClient client) {
    this.client = client;
  }

  public void startContainer(String containerId) {
    try {
      this.client.startContainerCmd(containerId).exec();
    } catch (Exception e) {
      throw new DockerRuntimeException("Error starting container", e);
    }
  }

  public String createContainer(CreateContainerParams params) {
    try {
      CreateContainerCmd createCommand = client.createContainerCmd(params.getImage());
      if (params.getName() != null) {
        createCommand = createCommand.withName(params.getName());
      }
      HostConfig hostConfig = newHostConfig();
      if (params.getPortsBindings() != null && params.getPortsBindings().size() != 0) {
        List<ExposedPort> exposedPorts = params.getPortsBindings().entrySet().stream()
            .map(portBind -> new ExposedPort(parseInt(portBind.getKey()))).collect(Collectors.toList());
        createCommand = createCommand.withExposedPorts(exposedPorts);

        Ports portsBinding = new Ports();

        params.getPortsBindings().entrySet().stream().forEach(portBind -> portsBinding
            .bind(new ExposedPort(parseInt(portBind.getKey())), Ports.Binding.bindPort(parseInt(portBind.getValue()))));

        hostConfig.withPortBindings(portsBinding);
      }
      if (params.getVolumesBindings() != null && params.getVolumesBindings().size() != 0) {
        List<Volume> volumes = new ArrayList<>();
        List<Bind> binds = new ArrayList<>();
        params.getVolumesBindings().entrySet().stream().forEach(volumeBind -> {
          volumes.add(new Volume(volumeBind.getValue()));
          binds.add(new Bind(volumeBind.getKey(), new Volume(volumeBind.getValue())));
        });
        createCommand.withVolumes(volumes);
        hostConfig.withBinds(binds);
      }
      createCommand = createCommand.withHostConfig(hostConfig);
      if (params.getCommands() != null) {
        createCommand.withCmd(params.getCommands());
      }
      return createCommand.exec().getId();
    } catch (Exception e) {
      throw new DockerRuntimeException("Error creating container", e);
    }
  }

  public void stopContainer(String containerId) {
    try {
      client.stopContainerCmd(containerId).exec();
    } catch (NotModifiedException e) {
      // already stopped
    } catch (Exception e) {
      throw new DockerRuntimeException("Error stop container", e);
    }
  }

  public void removeContainer(String containerId) {
    try {
      client.removeContainerCmd(containerId).exec();
    } catch (Exception e) {
      throw new DockerRuntimeException("Error removing container", e);
    }
  }

  public String execCommands(String containerId, String[] commands) throws DockerRuntimeException {
    try {
      ExecCreateCmdResponse createCmdResponse = client.
          execCreateCmd(containerId).
          withAttachStdout(true).
          withAttachStderr(true).
          withCmd(commands).
          exec();
      ByteArrayOutputStream stdout = new ByteArrayOutputStream();
      ByteArrayOutputStream stderr = new ByteArrayOutputStream();
      client.execStartCmd(createCmdResponse.getId()).exec(new ExecStartResultCallback(stdout, stderr))
          .awaitCompletion();
      return stdout.toString(UTF_8);
    } catch (Exception e) {
      throw new DockerRuntimeException("Error executing command", e);
    }
  }
}
