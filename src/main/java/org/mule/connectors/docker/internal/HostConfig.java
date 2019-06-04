
package org.mule.connectors.docker.internal;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.Parameter;

public class HostConfig {

    @JsonProperty("Binds")
    @Parameter
    @Optional
    public List<String> binds;

    @JsonProperty("Links")
    @Parameter
    @Optional
    public List<String> links;

    @JsonProperty("Memory")
    @Parameter
    @Optional
    public Integer memory;

    @JsonProperty("MemorySwap")
    @Parameter
    @Optional
    public Integer memorySwap;

    @JsonProperty("MemoryReservation")
    @Parameter
    @Optional
    public Integer memoryReservation;

    @JsonProperty("KernelMemory")
    @Parameter
    @Optional
    public Integer kernelMemory;

    @JsonProperty("NanoCPUs")
    @Parameter
    @Optional
    public Integer nanoCPUs;

    @JsonProperty("CpuPercent")
    @Parameter
    @Optional
    public Integer cpuPercent;

    @JsonProperty("CpuShares")
    @Parameter
    @Optional
    public Integer cpuShares;

    @JsonProperty("CpuPeriod")
    @Parameter
    @Optional
    public Integer cpuPeriod;

    @JsonProperty("CpuRealtimePeriod")
    @Parameter
    @Optional
    public Integer cpuRealtimePeriod;

    @JsonProperty("CpuRealtimeRuntime")
    @Parameter
    @Optional
    public Integer cpuRealtimeRuntime;

    @JsonProperty("CpuQuota")
    @Parameter
    @Optional
    public Integer cpuQuota;

    @JsonProperty("CpusetCpus")
    @Parameter
    @Optional
    public String cpusetCpus;

    @JsonProperty("CpusetMems")
    @Parameter
    @Optional
    public String cpusetMems;

    @JsonProperty("MaximumIOps")
    @Parameter
    @Optional
    public Integer maximumIOps;

    @JsonProperty("MaximumIOBps")
    @Parameter
    @Optional
    public Integer maximumIOBps;

    @JsonProperty("BlkioWeight")
    @Parameter
    @Optional
    public Integer blkioWeight;

    @Parameter
    @Optional
    @JsonProperty("MemorySwappiness")
    public Integer memorySwappiness;

    @JsonProperty("OomKillDisable")
    @Parameter
    @Optional
    public Boolean oomKillDisable;

    @JsonProperty("OomScoreAdj")
    @Parameter
    @Optional
    public Integer oomScoreAdj;

    @JsonProperty("PidMode")
    @Parameter
    @Optional
    public String pidMode;

    @JsonProperty("PidsLimit")
    @Parameter
    @Optional
    public Integer pidsLimit;

    @JsonProperty("PortBindings")
    @Parameter
    @Optional
    public Map<String, List<HostPort>> portBindings;

    @JsonProperty("PublishAllPorts")
    @Parameter
    @Optional
    public Boolean publishAllPorts;

    @JsonProperty("Privileged")
    @Parameter
    @Optional
    public Boolean privileged;

    @JsonProperty("ReadonlyRootfs")
    @Parameter
    @Optional
    public Boolean readonlyRootfs;

    public List<String> getBinds() {
        return binds;
    }

    public void setBinds(List<String> binds) {
        this.binds = binds;
    }

    public List<String> getLinks() {
        return links;
    }

    public void setLinks(List<String> links) {
        this.links = links;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public Integer getMemorySwap() {
        return memorySwap;
    }

    public void setMemorySwap(Integer memorySwap) {
        this.memorySwap = memorySwap;
    }

    public Integer getMemoryReservation() {
        return memoryReservation;
    }

    public void setMemoryReservation(Integer memoryReservation) {
        this.memoryReservation = memoryReservation;
    }

    public Integer getKernelMemory() {
        return kernelMemory;
    }

    public void setKernelMemory(Integer kernelMemory) {
        this.kernelMemory = kernelMemory;
    }

    public Integer getNanoCPUs() {
        return nanoCPUs;
    }

    public void setNanoCPUs(Integer nanoCPUs) {
        this.nanoCPUs = nanoCPUs;
    }

    public Integer getCpuPercent() {
        return cpuPercent;
    }

    public void setCpuPercent(Integer cpuPercent) {
        this.cpuPercent = cpuPercent;
    }

    public Integer getCpuShares() {
        return cpuShares;
    }

    public void setCpuShares(Integer cpuShares) {
        this.cpuShares = cpuShares;
    }

    public Integer getCpuPeriod() {
        return cpuPeriod;
    }

    public void setCpuPeriod(Integer cpuPeriod) {
        this.cpuPeriod = cpuPeriod;
    }

    public Integer getCpuRealtimePeriod() {
        return cpuRealtimePeriod;
    }

    public void setCpuRealtimePeriod(Integer cpuRealtimePeriod) {
        this.cpuRealtimePeriod = cpuRealtimePeriod;
    }

    public Integer getCpuRealtimeRuntime() {
        return cpuRealtimeRuntime;
    }

    public void setCpuRealtimeRuntime(Integer cpuRealtimeRuntime) {
        this.cpuRealtimeRuntime = cpuRealtimeRuntime;
    }

    public Integer getCpuQuota() {
        return cpuQuota;
    }

    public void setCpuQuota(Integer cpuQuota) {
        this.cpuQuota = cpuQuota;
    }

    public String getCpusetCpus() {
        return cpusetCpus;
    }

    public void setCpusetCpus(String cpusetCpus) {
        this.cpusetCpus = cpusetCpus;
    }

    public String getCpusetMems() {
        return cpusetMems;
    }

    public void setCpusetMems(String cpusetMems) {
        this.cpusetMems = cpusetMems;
    }

    public Integer getMaximumIOps() {
        return maximumIOps;
    }

    public void setMaximumIOps(Integer maximumIOps) {
        this.maximumIOps = maximumIOps;
    }

    public Integer getMaximumIOBps() {
        return maximumIOBps;
    }

    public void setMaximumIOBps(Integer maximumIOBps) {
        this.maximumIOBps = maximumIOBps;
    }

    public Integer getBlkioWeight() {
        return blkioWeight;
    }

    public void setBlkioWeight(Integer blkioWeight) {
        this.blkioWeight = blkioWeight;
    }

    public Integer getMemorySwappiness() {
        return memorySwappiness;
    }

    public void setMemorySwappiness(Integer memorySwappiness) {
        this.memorySwappiness = memorySwappiness;
    }

    public Boolean getOomKillDisable() {
        return oomKillDisable;
    }

    public void setOomKillDisable(Boolean oomKillDisable) {
        this.oomKillDisable = oomKillDisable;
    }

    public Integer getOomScoreAdj() {
        return oomScoreAdj;
    }

    public void setOomScoreAdj(Integer oomScoreAdj) {
        this.oomScoreAdj = oomScoreAdj;
    }

    public String getPidMode() {
        return pidMode;
    }

    public void setPidMode(String pidMode) {
        this.pidMode = pidMode;
    }

    public Integer getPidsLimit() {
        return pidsLimit;
    }

    public void setPidsLimit(Integer pidsLimit) {
        this.pidsLimit = pidsLimit;
    }

    public Map<String, List<HostPort>> getPortBindings() {
        return portBindings;
    }

    public void setPortBindings(
        Map<String, List<HostPort>> portBindings) {
        this.portBindings = portBindings;
    }

    public Boolean getPublishAllPorts() {
        return publishAllPorts;
    }

    public void setPublishAllPorts(Boolean publishAllPorts) {
        this.publishAllPorts = publishAllPorts;
    }

    public Boolean getPrivileged() {
        return privileged;
    }

    public void setPrivileged(Boolean privileged) {
        this.privileged = privileged;
    }

    public Boolean getReadonlyRootfs() {
        return readonlyRootfs;
    }

    public void setReadonlyRootfs(Boolean readonlyRootfs) {
        this.readonlyRootfs = readonlyRootfs;
    }
}
