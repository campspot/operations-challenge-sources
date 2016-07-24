package campspot.config;

import io.dropwizard.Configuration;

import javax.validation.constraints.NotNull;

public class SimpleConfig extends Configuration {
    @NotNull
    private String statusMessage;

    public String getStatusMessage() {
        return statusMessage;
    }
}
