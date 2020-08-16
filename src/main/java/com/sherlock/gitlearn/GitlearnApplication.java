package com.sherlock.gitlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitlearnApplication {

    @RequestMapping("/")
    String home() {
        return "Hello Git！-V.01";
    }

    public static void main(String[] args) {
        SpringApplication.run(GitlearnApplication.class, args);
    }

}
