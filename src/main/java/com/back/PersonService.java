package com.back;

import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService( PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public int count(){
        return personRepository.count();
    }
}
