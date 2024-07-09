package com.example.encurtador.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Prod {

    @Value("${config.properties}")
    boolean isDev;

    @Bean
    public CommandLineRunner startup() {

        return args -> {
            if (isDev) {
                System.out.println("AMBIENTE DE DESENVOLVIMENTO");
            } else if (!(isDev)) {
                System.out.println("AMBIENTE DE PROD");
            }
        };
    }
}
