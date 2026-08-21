package ru.dmitrii.OverRinCMS.util;

public class NewsNotFoundException extends RuntimeException {
    public NewsNotFoundException(int id){
        super("News with id " + id + " not found");
    }
}
