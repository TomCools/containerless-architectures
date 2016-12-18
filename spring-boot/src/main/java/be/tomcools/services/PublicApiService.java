package be.tomcools.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by tomco on 18/12/2016.
 */
@Service
public class PublicApiService {

    private RestTemplate restTemplate;

    @Autowired
    public PublicApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getJson() {
        return restTemplate.getForEntity("http://api.fixer.io/latest", String.class).getBody();
    }
}
