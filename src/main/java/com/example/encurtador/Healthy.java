package com.example.encurtador;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("check")
public class Healthy {

    @GetMapping()
    public ResponseEntity<String> check() {
        return ResponseEntity.ok("[Healthy Test API : STATUS 200]");
    }
}
