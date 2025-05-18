package com.example.springCloudOpenFeign.endpoint;

import com.example.springCloudOpenFeign.dto.Post;
import com.example.springCloudOpenFeign.service.PostService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("trigger")
public class TriggerEndpoint {
    private final PostService postService;

    public TriggerEndpoint(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public List<Post> getPosts() {
        log.info("Entering getPosts...");
        return postService.getPosts();
    }
}
