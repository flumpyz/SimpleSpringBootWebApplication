package com.example.demoweb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.io.ObjectInputStream;
import java.util.Date;

@Entity
public class Post implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String text;
    private Integer likes;
    private Date creationDate;

    public Post() {
    }

    public Post(Long id, String text, Date creationDate) {
        this.id = id;
        this.text = text;
        this.creationDate = creationDate;
        this.likes = 0;
    }

    public String getText() {
        return text;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getLikes() {
        return likes;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Long getId() { return id; }
}
