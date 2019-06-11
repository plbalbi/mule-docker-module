package org.mule.connectors.docker.operations;

import java.util.List;
import org.mule.connectors.docker.config.DockerConfig;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;

public class DockerOperations {

  @MediaType(value = "text/plain")
  @DisplayName("Create Container")
  public String createContainer(@Config DockerConfig config, CreateContainerParams params) {
      String containerId = config.getDockerOperations().createContainer(params);
      config.getDockerOperations().startContainer(containerId);
      return containerId;
  }

  @DisplayName("Remove Container")
  public void removeContainer(@Config DockerConfig config, String containerId) {
      config.getDockerOperations().stopContainer(containerId);
      config.getDockerOperations().removeContainer(containerId);
  }

  @MediaType(value = "text/plain")
  @DisplayName("Exec")
  public String executeCommand(@Config DockerConfig config, String containerId, List<String> commands) {
      String[] commandsAsArray = new String[commands.size()];
      commands.toArray(commandsAsArray);
      return config.getDockerOperations().execCommands(containerId, commandsAsArray);
  }
}
