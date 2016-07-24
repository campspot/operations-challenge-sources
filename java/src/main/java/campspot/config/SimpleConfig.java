package campspot.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import io.dropwizard.client.JerseyClientConfiguration;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class SimpleConfig extends Configuration {
    private String statusMessage = "";
    private JerseyClientConfiguration jerseyClientConfiguration = new JerseyClientConfiguration();
    private NodeConfig nodeConfig = new NodeConfig();

    @Valid
    @NotNull
    public String getStatusMessage() {
        return statusMessage;
    }

    @Valid
    @NotNull
    @JsonProperty("jerseyClient")
    public JerseyClientConfiguration getJerseyClientConfiguration() {
        return jerseyClientConfiguration;
    }

    @Valid
    @NotNull
    public NodeConfig getNodeConfig() {
        return nodeConfig;
    }
}
