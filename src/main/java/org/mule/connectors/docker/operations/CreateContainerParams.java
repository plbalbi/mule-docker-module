package org.mule.connectors.docker.operations;

import java.util.List;
import java.util.Map;
import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.Parameter;

public class CreateContainerParams {

  @Parameter
  private String image;

  @Parameter
  @Optional
  private String name;

  @Parameter
  @Optional
  private Map<String, String> volumesBindings;

  @Parameter
  @Optional
  private Map<String, String> portsBindings;

  @Parameter
  @Optional
  private List<String> commands;

  public List<String> getCommands() {
    return commands;
  }

  public void setCommands(List<String> commands) {
    this.commands = commands;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Map<String, String> getVolumesBindings() {
    return volumesBindings;
  }

  public void setVolumesBindings(Map<String, String> volumesBindings) {
    this.volumesBindings = volumesBindings;
  }

  public Map<String, String> getPortsBindings() {
    return portsBindings;
  }

  public void setPortsBindings(Map<String, String> portsBindings) {
    this.portsBindings = portsBindings;
  }
}
