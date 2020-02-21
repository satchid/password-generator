package com.sd.restdemo.controller;
import java.util.concurrent.atomic.AtomicLong;

import com.sd.restdemo.service.Password;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PasswordController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/getPassword")
    public Password pass(@RequestParam(value = "length", defaultValue = "8") int length) {
        return new Password(length);
    }
}

