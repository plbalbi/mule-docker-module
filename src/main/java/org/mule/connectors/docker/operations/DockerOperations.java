package org.mule.connectors.docker.operations;

import com.github.dockerjava.core.command.PullImageResultCallback;
import org.mule.connectors.docker.config.DockerConfig;
import org.mule.connectors.docker.error.DockerRuntimeException;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;

public class DockerOperations {


  @DisplayName("Start container")
  public void start(@Config DockerConfig config, String containerId) {
    try {
      config.getDockerClient().startContainerCmd(containerId).exec();
    } catch (Exception e) {
      throw new DockerRuntimeException("Start container error", e);
    }
  }

  @DisplayName("Stop Container")
  public void stop(@Config DockerConfig config, String containerId) {
    try {
      config.getDockerClient().stopContainerCmd(containerId).exec();
    } catch (Exception e) {
      throw new DockerRuntimeException("Stop container error", e);
    }
  }

  @DisplayName("Pull Image")
  public void pull(@Config DockerConfig config, String image) {
    try {
      PullImageResultCallback result = config.getDockerClient().pullImageCmd(image)
          .exec(new PullImageResultCallback());
      result.awaitSuccess();
    } catch (Exception e) {
      throw new DockerRuntimeException("Pull image error", e);
    }
  }

  @DisplayName("Remove Container")
  public void removeContainer(@Config DockerConfig config, String containerId) {
    try {
      config.getDockerClient().removeContainerCmd(containerId).exec();
    } catch (Exception e) {
      throw new DockerRuntimeException("Remove container error", e);
    }
  }
}
