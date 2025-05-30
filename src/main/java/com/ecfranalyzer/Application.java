package com.ecfranalyzer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication(scanBasePackages = "com.ecfranalyzer")
public class Application {

    // @Override
    // protected SpringApplicationBuilder configure(SpringApplicationBuilder
    // application) {
    // return application.sources(Application.class);
    // }

    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class).run(args);
    }
}