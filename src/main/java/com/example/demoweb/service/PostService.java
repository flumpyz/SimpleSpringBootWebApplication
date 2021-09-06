package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts() {
        List<Post> posts = new ArrayList<>();
        List<String> texts = Arrays.asList("Good", "Cool", "Bad");

        for(int i = 0; i < 3; i++) {
            posts.add(new Post(texts.get(i), new Date()));
        }

        return posts;
    }
}
