package com.example.serviceshuffle.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.CompletableFuture;

@Service
public class LogService {
    private final RestTemplate restTemplate;

    @Value("${service.log.url}")
    String url;

    public LogService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @Async
    public CompletableFuture<Void> logRequest(String data) {
        restTemplate.postForObject(url, data, String.class);
        return CompletableFuture.completedFuture(null);
    }
}
