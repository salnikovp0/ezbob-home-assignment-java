package com.example.servicelog.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
    @PostMapping("/log")
    public void LogMessage() { }
}
