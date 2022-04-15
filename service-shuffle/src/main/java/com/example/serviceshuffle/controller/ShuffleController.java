package com.example.serviceshuffle.controller;

import com.example.serviceshuffle.model.ShuffleRequest;
import com.example.serviceshuffle.service.ShuffleService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@Data
@RestController
public class ShuffleController {
    @Autowired
    private final ShuffleService shuffleService;

    @PostMapping("/shuffle")
    public ResponseEntity<int[]> createUser(@Valid @RequestBody ShuffleRequest shuffle) throws InterruptedException {
        return ResponseEntity.status(HttpStatus.CREATED).body(shuffleService.shuffle(shuffle));
    }
}
