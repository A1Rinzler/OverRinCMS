package ru.dmitrii.OverRinCMS.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import ru.dmitrii.OverRinCMS.dto.AdminNewsDTO;
import ru.dmitrii.OverRinCMS.dto.NewsDTO;
import ru.dmitrii.OverRinCMS.model.News;

@Mapper(componentModel = "spring")
public interface NewsDTO_Mapper {

    NewsDTO toNewsDTO(News news);

    AdminNewsDTO toNewsDTOAdmin(News news);
    News toNews(AdminNewsDTO newsDTO);
    void updateNewsFromAdminNewsDTO(AdminNewsDTO newsDTO, @MappingTarget News news);

}
