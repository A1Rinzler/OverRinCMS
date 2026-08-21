package ru.dmitrii.OverRinCMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.dmitrii.OverRinCMS.dto.NewsDTO;
import ru.dmitrii.OverRinCMS.service.NewsService;

import java.util.Optional;

@RestController
@RequestMapping("")
public class NewsController {

    private final NewsService newsService;

    @Autowired
    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping("/id{id}")
    public Optional<NewsDTO> getNews(@PathVariable("id") int id){
        return newsService.findById(id);

    }

    @PutMapping("/id{id}")
    public ResponseEntity<Void> updateNews(@PathVariable("id") int id, @RequestBody NewsDTO newsDTO){
        //тот же save
        //todo добавить проверки. есть ли новость вообще
        newsService.update(id, newsDTO);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/add") //добавление новости, тестим через PostMan
    public ResponseEntity<HttpStatus> addNewNews(@RequestBody NewsDTO newsDTO){
        newsService.save(newsDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(HttpStatus.CREATED);
    }
}
