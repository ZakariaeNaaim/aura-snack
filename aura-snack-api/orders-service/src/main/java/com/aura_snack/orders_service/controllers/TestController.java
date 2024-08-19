package com.aura_snack.orders_service.controllers;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${custom.property}")
    private String customProperty;

    @GetMapping("/test")
    public String testConfig() {
        return "Custom Property Value: " + customProperty;
    }
}
