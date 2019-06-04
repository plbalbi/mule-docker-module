package org.mule.connectors.docker.config;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.core.DefaultDockerClientConfig;
import com.github.dockerjava.core.DockerClientBuilder;
import com.github.dockerjava.core.DockerClientConfig;
import org.mule.connectors.docker.operations.DockerOperations;
import org.mule.runtime.api.lifecycle.Disposable;
import org.mule.runtime.api.lifecycle.Initialisable;
import org.mule.runtime.api.lifecycle.InitialisationException;
import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.param.Parameter;

@Operations({DockerOperations.class})
@Configuration(name = "incoming")
public class DockerConfig implements Initialisable, Disposable {

  @Parameter
  private String uri;

  @Parameter
  private String version;

  DockerClient dockerClient;

  @Override
  public void initialise() throws InitialisationException {
    DockerClientConfig config = DefaultDockerClientConfig.createDefaultConfigBuilder()
        .withDockerHost(uri)
        .withApiVersion(version)
        .build();
    dockerClient = DockerClientBuilder.getInstance(config).build();
  }

  @Override
  public void dispose() {
    dockerClient = null;

  }

  public String getUri() {
    return uri;
  }

  public String getVersion() {
    return version;
  }

  public DockerClient getDockerClient() {
    return dockerClient;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public void setVersion(String version) {
    this.version = version;
  }
}
