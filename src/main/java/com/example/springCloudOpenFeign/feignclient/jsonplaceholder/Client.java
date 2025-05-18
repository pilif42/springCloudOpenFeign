package com.example.springCloudOpenFeign.feignclient.jsonplaceholder;

import com.example.springCloudOpenFeign.dto.Post;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * value = a mandatory, arbitrary client name
 *
 * url = the API base URL
 *
 * configuration = Specify a custom class to override the default configuration. In our case, the client is composed from the components already in FeignClientsConfiguration together with any in ClientConfiguration (where the latter will override the former).
 *
 * fallback = If feign.hystrix.enabled=true in application.properties, when the real 'jsonplaceholder.typicode.com' service fails, ClientFallback will be used rather than generating an exception.
 */
@FeignClient(value = "jsonplaceholder",
        url = "https://jsonplaceholder.typicode.com/",
        configuration = ClientConfiguration.class,
        fallback = ClientFallback.class)
public interface Client {
    @RequestMapping(method = RequestMethod.GET, value = "/posts")
    List<Post> getPosts();

    @RequestMapping(method = RequestMethod.GET, value = "/posts/{postId}", produces = "application/json")
    Post getPostById(@PathVariable("postId") Long postId);
}
