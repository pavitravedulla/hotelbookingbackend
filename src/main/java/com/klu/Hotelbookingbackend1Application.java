package com.klu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Hotelbookingbackend1Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Hotelbookingbackend1Application.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        // Point to your main application class
        return application.sources(Hotelbookingbackend1Application.class);
    }
}
