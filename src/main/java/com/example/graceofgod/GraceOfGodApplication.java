package com.example.graceofgod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class GraceOfGodApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraceOfGodApplication.class, args);
    }
    
    @GetMapping("/")
    public String home() {
        return "index";
    }
}