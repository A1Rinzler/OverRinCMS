package ru.dmitrii.OverRinCMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.dmitrii.OverRinCMS.model.News;
import ru.dmitrii.OverRinCMS.service.NewsService;

@RestController
@RequestMapping("")
public class NewsController {

    private final NewsService newsService;

    @Autowired
    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping("/news")
    public String getNews(){
        return "news";
    }

    @PostMapping("/add") //добавление новости, тестим через PostMan
    public ResponseEntity<HttpStatus> addNewNews(@RequestBody News news){
        newsService.save(news);
        return ResponseEntity.status(HttpStatus.CREATED).body(HttpStatus.CREATED);
    }
}
