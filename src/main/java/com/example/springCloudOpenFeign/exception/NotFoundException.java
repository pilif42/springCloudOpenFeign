package com.example.springCloudOpenFeign.exception;

public class NotFoundException extends Exception {
    public NotFoundException(String msg) {
        super(msg);
    }
}