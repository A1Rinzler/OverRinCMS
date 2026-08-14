package ru.dmitrii.OverRinCMS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.dmitrii.OverRinCMS.model.News;
import ru.dmitrii.OverRinCMS.repository.NewsRepository;

import java.util.Optional;

@Service
public class NewsService {

    private NewsRepository newsRepository;

    @Autowired
    public NewsService(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }
    @Transactional
    public Optional<News> findById(int id){
        return newsRepository.findById(id);
    }
    @Transactional
    public void save(News news){
        newsRepository.save(news);
    }

    @Transactional
    public void update(News news){
        newsRepository.save(news);
    }
}
