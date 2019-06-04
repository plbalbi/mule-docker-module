
package org.mule.connectors.docker.internal;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.Parameter;

public class HostPort {

    @JsonProperty("HostPort")
    @Parameter
    @Optional
    public String hostPort;

    public String getHostPort() {
        return hostPort;
    }

    public void setHostPort(String hostPort) {
        this.hostPort = hostPort;
    }
}
