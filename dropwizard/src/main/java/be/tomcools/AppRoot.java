package be.tomcools;

import com.codahale.metrics.health.HealthCheck;
import io.dropwizard.Application;
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
    public void run(AppRootConfiguration configuration,
                    Environment environment) {
        environment.jersey().register(HelloWorldEndpoint.class);

        environment.healthChecks().register("EveryOneAwake", new HealthCheck() {
            @Override
            protected Result check() throws Exception {
                return Result.healthy("Yeey! Everyone is still awake during my presentation. :-)");
            }
        });
    }

}