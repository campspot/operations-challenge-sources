package campspot;

import campspot.config.SimpleConfig;
import campspot.resources.StatusResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class App extends Application<SimpleConfig> {
    public static void main(String[] args) throws Exception {
        new App().run(args);
    }

    @Override
    public void run(SimpleConfig config, Environment environment) throws Exception {
        final StatusResource statusResource = new StatusResource(config.getStatusMessage());

        environment.jersey().register(statusResource);
    }
}
