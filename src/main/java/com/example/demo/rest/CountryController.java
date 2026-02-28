package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @GetMapping("/france")
    public String france(){
        return "Capitala e Paris";
    }

    @GetMapping("/md")
    public String moldova(){
        return "Capitala e Chisinau";
    }

    @GetMapping("/germany")
    public String germany(){
        return "Capitala e Berlin";
    }
}
