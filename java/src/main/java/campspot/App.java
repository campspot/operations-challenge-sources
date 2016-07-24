package campspot;

import campspot.config.SimpleConfig;
import campspot.healthcheck.NodeHealthCheck;
import campspot.resources.StatusResource;
import io.dropwizard.Application;
import io.dropwizard.client.JerseyClientBuilder;
import io.dropwizard.setup.Environment;

import javax.ws.rs.client.Client;

public class App extends Application<SimpleConfig> {
    public static void main(String[] args) throws Exception {
        new App().run(args);
    }

    @Override
    public void run(SimpleConfig config, Environment environment) throws Exception {
        final StatusResource statusResource = new StatusResource(config.getStatusMessage());
        final Client client = new JerseyClientBuilder(environment)
            .using(config.getJerseyClientConfiguration())
            .build(getName());

        environment.jersey().register(statusResource);
        environment.healthChecks().register("node", new NodeHealthCheck(config.getNodeConfig(), client));
    }
}
