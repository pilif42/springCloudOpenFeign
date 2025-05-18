package com.example.springCloudOpenFeign.dto;

import java.util.Objects;

public record Post(int userId, int id, String title, String body) {
    public Post {
        if (userId < 0) {
            throw new IllegalArgumentException("userId cannot be negative");
        }
        if (id < 0) {
            throw new IllegalArgumentException("id cannot be negative");
        }
        Objects.requireNonNull(title);
        Objects.requireNonNull(body);
    }
}
