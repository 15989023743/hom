package com.lemon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/substitution")
public class SubstitutionController {
    @Autowired
    @Qualifier(value = "remoteRestTemplate")
    private RestTemplate restTemplate;

    @GetMapping("/hello")
    public String callHello() {
        return restTemplate.getForObject("http://LEMON-PROVIDER/helloWorld", String.class);
    }
}
