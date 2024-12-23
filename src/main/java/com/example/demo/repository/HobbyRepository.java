package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Hobby;

public interface HobbyRepository extends JpaRepository<Hobby, Long> {
    List<Hobby> findByName(String name);
}