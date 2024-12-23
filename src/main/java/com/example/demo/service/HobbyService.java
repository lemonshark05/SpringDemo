package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Hobby;
import com.example.demo.repository.HobbyRepository;

@Service
public class HobbyService {

	private final HobbyRepository hobbyRepository;

    public HobbyService(HobbyRepository hobbyRepository) {
        this.hobbyRepository = hobbyRepository;
    }

    public List<Hobby> getHobbiesByName(String name) {
        return hobbyRepository.findByName(name);
    }

}
