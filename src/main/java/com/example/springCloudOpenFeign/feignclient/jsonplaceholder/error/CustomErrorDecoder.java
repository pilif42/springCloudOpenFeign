package com.example.springCloudOpenFeign.feignclient.jsonplaceholder.error;

import com.example.springCloudOpenFeign.exception.BadRequestException;
import com.example.springCloudOpenFeign.exception.NotFoundException;
import feign.Response;
import feign.codec.ErrorDecoder;

public class CustomErrorDecoder implements ErrorDecoder {
    @Override
    public Exception decode(String methodKey, Response response) {
        return switch (response.status()) {
            case 400 -> new BadRequestException(response.reason());
            case 404 -> new NotFoundException(response.reason());
            default -> new Exception("Generic error");
        };
    }
}
