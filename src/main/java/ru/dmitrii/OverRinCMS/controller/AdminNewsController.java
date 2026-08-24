package ru.dmitrii.OverRinCMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.dmitrii.OverRinCMS.dto.AdminNewsDTO;
import ru.dmitrii.OverRinCMS.dto.NewsDTO;
import ru.dmitrii.OverRinCMS.service.NewsService;

import java.util.Optional;

@RestController
@RequestMapping("/admin")
public class AdminNewsController {

    private final NewsService newsService;

    @Autowired
    public AdminNewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    //todo права админа
    @GetMapping("/id{id}")
    public Optional<AdminNewsDTO> getNews(@PathVariable("id") int id) {
        return newsService.findByIdAdmin(id);

    }
    //todo права админа
    @PutMapping("/id{id}")
    public ResponseEntity<Void> updateNews(@PathVariable("id") int id, @RequestBody AdminNewsDTO adminNewsDTO) {
        //todo добавить проверки. есть ли новость вообще
        newsService.update(id, adminNewsDTO);
        return ResponseEntity.ok().build();
    }

    //todo права админа
    @PostMapping("/add") //добавление новости, тестим через PostMan
    public ResponseEntity<HttpStatus> addNewNews(@RequestBody AdminNewsDTO adminNewsDTO) {
        newsService.save(adminNewsDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(HttpStatus.CREATED);
    }

    //todo права админа
    @DeleteMapping("/id{id}")
    public ResponseEntity<Void> deleteNews(@PathVariable("id") int id) {
        newsService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
