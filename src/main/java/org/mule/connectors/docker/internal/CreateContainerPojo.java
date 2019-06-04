
package org.mule.connectors.docker.internal;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.Parameter;

public class CreateContainerPojo {

    @JsonProperty("Hostname")
    @Parameter
    @Optional
    public String hostname;

    @JsonProperty("Domainname")
    @Parameter
    @Optional
    public String domainname;

    @JsonProperty("User")
    @Parameter
    @Optional
    public String user;

    @JsonProperty("AttachStdin")
    @Parameter
    @Optional
    public Boolean attachStdin;

    @JsonProperty("AttachStdout")
    @Parameter
    @Optional
    public Boolean attachStdout;

    @JsonProperty("AttachStderr")
    @Parameter
    @Optional
    public Boolean attachStderr;

    @JsonProperty("Tty")
    @Parameter
    @Optional
    public Boolean tty;

    @JsonProperty("OpenStdin")
    @Parameter
    @Optional
    public Boolean openStdin;

    @JsonProperty("StdinOnce")
    @Parameter
    @Optional
    public Boolean stdinOnce;

    @JsonProperty("Env")
    @Parameter
    @Optional
    public List<String> env;

    @JsonProperty("Cmd")
    @Parameter
    @Optional
    public List<String> cmd;

    @JsonProperty("Entrypoint")
    @Parameter
    @Optional
    public String entrypoint;

    @JsonProperty("Image")
    @Parameter
    public String image;

    // TODO : VOLUMES
    @JsonProperty("WorkingDir")
    @Parameter
    @Optional
    public String workingDir;

    @JsonProperty("NetworkDisabled")
    @Parameter
    @Optional
    public Boolean networkDisabled;

    @JsonProperty("MacAddress")
    @Parameter
    @Optional
    public String macAddress;

    @JsonProperty("StopSignal")
    @Parameter
    @Optional
    public String stopSignal;

    @JsonProperty("StopTimeout")
    @Parameter
    @Optional
    public Integer stopTimeout;

    @JsonProperty("HostConfig")
    @Parameter
    @Optional
    public HostConfig hostConfig;

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getDomainname() {
        return domainname;
    }

    public void setDomainname(String domainname) {
        this.domainname = domainname;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Boolean getAttachStdin() {
        return attachStdin;
    }

    public void setAttachStdin(Boolean attachStdin) {
        this.attachStdin = attachStdin;
    }

    public Boolean getAttachStdout() {
        return attachStdout;
    }

    public void setAttachStdout(Boolean attachStdout) {
        this.attachStdout = attachStdout;
    }

    public Boolean getAttachStderr() {
        return attachStderr;
    }

    public void setAttachStderr(Boolean attachStderr) {
        this.attachStderr = attachStderr;
    }

    public Boolean getTty() {
        return tty;
    }

    public void setTty(Boolean tty) {
        this.tty = tty;
    }

    public Boolean getOpenStdin() {
        return openStdin;
    }

    public void setOpenStdin(Boolean openStdin) {
        this.openStdin = openStdin;
    }

    public Boolean getStdinOnce() {
        return stdinOnce;
    }

    public void setStdinOnce(Boolean stdinOnce) {
        this.stdinOnce = stdinOnce;
    }

    public List<String> getEnv() {
        return env;
    }

    public void setEnv(List<String> env) {
        this.env = env;
    }

    public List<String> getCmd() {
        return cmd;
    }

    public void setCmd(List<String> cmd) {
        this.cmd = cmd;
    }

    public String getEntrypoint() {
        return entrypoint;
    }

    public void setEntrypoint(String entrypoint) {
        this.entrypoint = entrypoint;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getWorkingDir() {
        return workingDir;
    }

    public void setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
    }

    public Boolean getNetworkDisabled() {
        return networkDisabled;
    }

    public void setNetworkDisabled(Boolean networkDisabled) {
        this.networkDisabled = networkDisabled;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getStopSignal() {
        return stopSignal;
    }

    public void setStopSignal(String stopSignal) {
        this.stopSignal = stopSignal;
    }

    public Integer getStopTimeout() {
        return stopTimeout;
    }

    public void setStopTimeout(Integer stopTimeout) {
        this.stopTimeout = stopTimeout;
    }

    public HostConfig getHostConfig() {
        return hostConfig;
    }

    public void setHostConfig(HostConfig hostConfig) {
        this.hostConfig = hostConfig;
    }
}
