package be.tomcools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Created by tomco on 18/12/2016.
 */
@SpringBootApplication
public class ApplicationStarter {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationStarter.class, args);
    }

    @Bean
    public HealthIndicator isAlive() {
        return new HealthIndicator() {
            public Health health() {
                return Health.status("I'm up, don't worry :)").build();
            }
        };
    }
}
