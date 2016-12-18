package be.tomcools.resources;

import be.tomcools.services.PublicApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

    final PublicApiService publicApiService;

    @Autowired
    public HelloResource(PublicApiService publicApiService) {
        this.publicApiService = publicApiService;
    }

    @RequestMapping("/hello")
    String home() {
        return "Hello World! - Spring Boot" + publicApiService.getJson();
    }
}
