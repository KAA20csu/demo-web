package com.example.demoweb.model;

import java.util.Date;

public class Post {
    private String text;
    private int likes;

    private String creationDate;

    public Post(String text) {
        this.text = text;
        this.creationDate = new Date().toString();
    }

    public int getLikes() {
        return likes;
    }

    public String getText() {
        return text;
    }

    public String getCreationDate() { return creationDate; }
}
