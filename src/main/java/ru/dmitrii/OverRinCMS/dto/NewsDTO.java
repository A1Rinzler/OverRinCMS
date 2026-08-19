package ru.dmitrii.OverRinCMS.dto;

import jakarta.persistence.Column;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

public class NewsDTO {

    @Column(name = "title")
    private String title;

    @Column(name = "news_text")
    private String news_text;

    @Column(name = "author")
    private String author;

    @CreationTimestamp
    @Column(name = "create_time")
    private LocalDateTime create_time;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNews_text() {
        return news_text;
    }

    public void setNews_text(String news_text) {
        this.news_text = news_text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDateTime getCreate_time() {
        return create_time;
    }

    public void setCreate_time(LocalDateTime create_time) {
        this.create_time = create_time;
    }
}
