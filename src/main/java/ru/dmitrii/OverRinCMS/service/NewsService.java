package ru.dmitrii.OverRinCMS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.dmitrii.OverRinCMS.dto.NewsDTO;
import ru.dmitrii.OverRinCMS.mapper.NewsDTO_Mapper;
import ru.dmitrii.OverRinCMS.model.News;
import ru.dmitrii.OverRinCMS.repository.NewsRepository;

import java.util.Optional;

@Service
public class NewsService {

    private final NewsRepository newsRepository;
    private final NewsDTO_Mapper newsDTO_Mapper;

    @Autowired
    public NewsService(NewsRepository newsRepository, NewsDTO_Mapper newsDTO_Mapper) {
        this.newsRepository = newsRepository;
        this.newsDTO_Mapper = newsDTO_Mapper;
    }

    @Transactional
    public Optional<NewsDTO> findById(int id){
        News news = newsRepository.findById(id).orElse(null);

        if (news == null){
            return Optional.empty();
        }
        return Optional.of( newsDTO_Mapper.toNewsDTO(news));
    }

    @Transactional
    public void save(NewsDTO newsDTO){
        News news = newsDTO_Mapper.toNews(newsDTO);
        newsRepository.save(news);
    }

    @Transactional
    public void update(int id, NewsDTO newsDTO){
        News news = newsRepository.findById(id).orElseThrow();
       newsDTO_Mapper.updatedNewsFromDto(newsDTO, news);
    }
}
