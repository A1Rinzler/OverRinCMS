package ru.dmitrii.OverRinCMS.mapper;

import org.mapstruct.Mapper;
import ru.dmitrii.OverRinCMS.dto.NewsDTO;
import ru.dmitrii.OverRinCMS.model.News;

@Mapper(componentModel = "spring")
public interface NewsDTO_Mapper {

    NewsDTO toNewsDTO(News news);
    News toNews(NewsDTO_Mapper newsDTO_Mapper);
}
