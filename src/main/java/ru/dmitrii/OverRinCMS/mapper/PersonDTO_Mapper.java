package ru.dmitrii.OverRinCMS.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import ru.dmitrii.OverRinCMS.dto.PersonDTO;
import ru.dmitrii.OverRinCMS.model.Person;

@Mapper(componentModel = "spring")
public interface PersonDTO_Mapper {

    PersonDTO_Mapper toPerson(Person person);
    Person toPersonDTO(PersonDTO personDTO);
    void updatePersonFromPersonDTO(PersonDTO personDTO, @MappingTarget Person person);
}
