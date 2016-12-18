package be.tomcools.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {
    @RequestMapping("/hello")
    String home() {
        return "Hello World! - Spring Boot";
    }
}
