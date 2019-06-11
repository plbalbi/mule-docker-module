package org.mule.connectors.docker.config;

import com.github.dockerjava.core.DefaultDockerClientConfig;
import com.github.dockerjava.core.DockerClientBuilder;
import com.github.dockerjava.core.DockerClientConfig;
import org.mule.connectors.docker.internal.DockerClientOperations;
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
  private String host;

  @Parameter
  private String version;

  private DockerClientOperations dockerOperations;

  @Override
  public void initialise() throws InitialisationException {
    DockerClientConfig config = DefaultDockerClientConfig.createDefaultConfigBuilder()
        .withDockerHost(host)
        .withApiVersion(version)
        .build();
    dockerOperations = new DockerClientOperations(DockerClientBuilder.getInstance(config).build());
  }

  @Override
  public void dispose() {
    dockerOperations = null;

  }

  public DockerClientOperations getDockerOperations() {
    return dockerOperations;
  }

  public String getHost() {
    return host;
  }

  public String getVersion() {
    return version;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public void setVersion(String version) {
    this.version = version;
  }
}
