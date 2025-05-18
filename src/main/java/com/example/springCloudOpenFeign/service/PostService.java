package com.example.springCloudOpenFeign.service;

import com.example.springCloudOpenFeign.dto.Post;
import com.example.springCloudOpenFeign.feignclient.jsonplaceholder.Client;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private final Client jsonPlaceHolderClient;

    public PostService(Client jsonPlaceHolderClient) {
        this.jsonPlaceHolderClient = jsonPlaceHolderClient;
    }

    public List<Post> getPosts() {
        return jsonPlaceHolderClient.getPosts();
    }
}
