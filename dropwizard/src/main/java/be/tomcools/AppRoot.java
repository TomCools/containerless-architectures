package be.tomcools;

import com.codahale.metrics.health.HealthCheck;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class AppRoot extends Application<AppRootConfiguration> {
    public static void main(String[] args) throws Exception {
        new AppRoot().run("server");
    }

    @Override
    public String getName() {
        return "hello-world";
    }

    @Override
    public void initialize(Bootstrap<AppRootConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(AppRootConfiguration configuration,
                    Environment environment) {
        environment.jersey().register(HelloWorldEndpoint.class);
    }

}