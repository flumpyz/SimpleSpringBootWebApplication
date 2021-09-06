package com.example.demoweb.model;

import java.io.ObjectInputStream;

public class Post {
    private String text;
    private Integer likes;

    public Post(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public Integer getLikes() {
        return likes;
    }
}
