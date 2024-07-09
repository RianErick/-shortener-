package com.example.encurtador.config;

import com.example.encurtador.infra.URLInterface;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
public class Scheduling {

    private final URLInterface urlInterface;

    public Scheduling(URLInterface urlInterface) {
        this.urlInterface = urlInterface;
    }

    protected final Long MINUTES = 180000L;

    @Scheduled(fixedDelay = 180000L)
    public void clearDatabase() {
          urlInterface.deleteAll();
    }
}
