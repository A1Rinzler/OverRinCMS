package ru.dmitrii.OverRinCMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.dmitrii.OverRinCMS.dto.NewsDTO;
import ru.dmitrii.OverRinCMS.service.NewsService;

import java.util.Optional;

@RestController
@RequestMapping("/news")
public class NewsController {

    private final NewsService newsService;

    @Autowired
    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping("/id{id}")
    public Optional<NewsDTO> getNews(@PathVariable("id") int id) {
        return newsService.findById(id);

    }
}
