package org.example;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;
import org.example.health.BasicHealthCheck;
import org.example.resources.HelloWorld;

public class App extends Application<Configuration> {

    public static void main(final String[] args) throws Exception {
        new App().run(args);
    }

    @Override
    public String getName() {
        return "true";
    }

    @Override
    public void initialize(final Bootstrap<Configuration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final Configuration configuration,
                    final Environment environment) {
        // register resources
        HelloWorld helloWorld = new HelloWorld();
        environment.jersey().register(helloWorld);
        // register health check
        BasicHealthCheck basicHealthCheck = new BasicHealthCheck();
        environment.healthChecks().register("basic", basicHealthCheck);

    }

}
