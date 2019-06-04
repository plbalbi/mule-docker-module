package org.mule.connectors.docker;

import org.mule.connectors.docker.config.DockerConfig;
import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;

@Extension(name = "DockerModule")
@DisplayName("Docker")
@Configurations(value = {DockerConfig.class})
public class DockerModule {

}
