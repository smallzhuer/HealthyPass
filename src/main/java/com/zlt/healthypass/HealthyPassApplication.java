package com.zlt.healthypass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableOpenApi
@SpringBootApplication
public class HealthyPassApplication {

    public static void main(String[] args) {
        SpringApplication.run(HealthyPassApplication.class, args);
    }

}
