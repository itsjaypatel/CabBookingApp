package com.itsjaypatel.cabbookingapp.utils;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
public class ApiResponse<T> {

    private int statusCode;

    private T data;

    private ApiError error;

    private final LocalDateTime timestamp;

    private ApiResponse() {
        this.timestamp = LocalDateTime.now();
    }

    public ApiResponse(int statusCode, T data) {
        this();
        this.statusCode = statusCode;
        this.data = data;
    }

    public ApiResponse(int statusCode, ApiError error) {
        this();
        this.statusCode = statusCode;
        this.error = error;
    }
}
