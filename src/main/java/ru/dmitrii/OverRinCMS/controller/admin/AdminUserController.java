package ru.dmitrii.OverRinCMS.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.dmitrii.OverRinCMS.dto.PersonDTO;
import ru.dmitrii.OverRinCMS.service.PersonService;

@RestController
@RequestMapping("/admin/adduser")
public class AdminUserController {

    private final PersonService personService;

    @Autowired
    public AdminUserController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("")
    public ResponseEntity<HttpStatus> addPerson(@RequestBody PersonDTO personDTO) {
        personService.addNewPerson(personDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(HttpStatus.CREATED);
    }
}
