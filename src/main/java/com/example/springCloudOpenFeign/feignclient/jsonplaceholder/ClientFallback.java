package com.example.springCloudOpenFeign.feignclient.jsonplaceholder;

import com.example.springCloudOpenFeign.dto.Post;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class ClientFallback implements Client {
    @Override
    public List<Post> getPosts() {
        return Collections.emptyList();
    }

    @Override
    public Post getPostById(Long postId) {
        return null;
    }
}
