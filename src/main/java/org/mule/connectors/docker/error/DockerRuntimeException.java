package org.mule.connectors.docker.error;

public class DockerRuntimeException extends RuntimeException {

  public DockerRuntimeException(String msg, Exception cause) {
    super(msg, cause);
  }

  public DockerRuntimeException(String msg) {
    super(msg);
  }
}
