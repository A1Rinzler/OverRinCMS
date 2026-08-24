package ru.dmitrii.OverRinCMS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.dmitrii.OverRinCMS.model.Person;
import ru.dmitrii.OverRinCMS.repository.PersonRepository;
import ru.dmitrii.OverRinCMS.secutiry.PersonDetails;

import java.util.Optional;

@Service
public class PersonDetailService implements UserDetailsService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonDetailService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        Optional<Person> person = personRepository.findByLogin(login);
        if (person.isEmpty()) {
            throw new UsernameNotFoundException("user not found");
        }
        return new PersonDetails(person.get());
    }
}
