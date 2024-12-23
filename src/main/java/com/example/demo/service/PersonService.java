package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Person;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.PersonRepository;

@Service
public class PersonService {
	private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person createPerson(Person person) {
        return personRepository.save(person);
    }

    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    public Person getPersonById(Long id) {
        return personRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Person not found with id: " + id));
    }

    public Person updatePerson(Long id, Person personDetails) {
        Person person = getPersonById(id);
        person.setName(personDetails.getName());
        person.setPhoneNumber(personDetails.getPhoneNumber());
        person.setAddress(personDetails.getAddress());
        return personRepository.save(person);
    }

    public void deletePerson(Long id) {
        Person person = getPersonById(id);
        personRepository.delete(person);
    }
    
    public List<Person> getPersonsByHobby(String hobbyName) {
        return personRepository.findByHobbies_Name(hobbyName);
    }
}
