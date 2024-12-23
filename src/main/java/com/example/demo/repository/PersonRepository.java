package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

import com.example.demo.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
	List<Person> findByHobbies_Name(String name);
}
