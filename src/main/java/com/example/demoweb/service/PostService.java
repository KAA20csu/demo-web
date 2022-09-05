package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostService {
    public List<Post> listAllPosts() {
        return Arrays.asList(new Post("Hello"), new Post("World"), new Post("!"));
    }
}
