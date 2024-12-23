package com.example.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Hobby;
import com.example.demo.service.HobbyService;

@RestController
@RequestMapping("/api/hobbies")
public class HobbyController {

    private final HobbyService hobbyService;

    public HobbyController(HobbyService hobbyService) {
        this.hobbyService = hobbyService;
    }

    @GetMapping
    public ResponseEntity<List<Hobby>> getHobbiesByName(@RequestParam String name) {
        return ResponseEntity.ok(hobbyService.getHobbiesByName(name));
    }
}