package com.aura_snack.orders_service.controllers;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/orders")
@RestController
public class TestController {


    @GetMapping("/test")
    public String testConfig() {
        return "Custom Property Value: test";
    }
}
