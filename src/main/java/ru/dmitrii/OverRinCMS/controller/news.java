package ru.dmitrii.OverRinCMS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class news {

    @GetMapping("/news")
    public String getNews(){
        return "news";
    }
}
