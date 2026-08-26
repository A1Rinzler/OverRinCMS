package ru.dmitrii.OverRinCMS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.dmitrii.OverRinCMS.dto.PersonDTO;
import ru.dmitrii.OverRinCMS.mapper.PersonDTO_Mapper;
import ru.dmitrii.OverRinCMS.model.Person;
import ru.dmitrii.OverRinCMS.repository.PersonRepository;


@Service
public class PersonService {

    private final PersonRepository personRepository;
    private final PasswordEncoder passwordEncoder;
    private final PersonDTO_Mapper personDTO_Mapper;


    @Autowired
    public PersonService(PersonRepository personRepository, PasswordEncoder passwordEncoder, PersonDTO_Mapper personDTOMapper) {
        this.personRepository = personRepository;
        this.passwordEncoder = passwordEncoder;
        this.personDTO_Mapper = personDTOMapper;
    }

    @Transactional
    public void addNewPerson(PersonDTO personDTO) {
        Person person = personDTO_Mapper.toPerson(personDTO);
        person.setPassword(passwordEncoder.encode(person.getPassword()));
        person.setRole("ROLE_USER");
        personRepository.save(person);
    }
}
