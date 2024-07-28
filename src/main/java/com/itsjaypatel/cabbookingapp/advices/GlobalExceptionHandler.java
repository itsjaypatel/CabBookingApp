package com.itsjaypatel.cabbookingapp.advices;

import com.itsjaypatel.cabbookingapp.exceptions.ResourceNotFoundException;
import com.itsjaypatel.cabbookingapp.exceptions.UserAlreadySignUpException;
import com.itsjaypatel.cabbookingapp.utils.ApiError;
import com.itsjaypatel.cabbookingapp.utils.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UserAlreadySignUpException.class)
    public ResponseEntity<ApiResponse<ApiError>> handleUserAlreadySignUpException(UserAlreadySignUpException e) {
        return new ResponseEntity<>(
                new ApiResponse<>(
                        HttpStatus.CONFLICT.value(),
                        ApiError.builder().message(e.getMessage()).build()),
                HttpStatus.CONFLICT);
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse<ApiError>> handleResourceNotFoundException(ResourceNotFoundException e) {
        return new ResponseEntity<>(
                new ApiResponse<>(
                        HttpStatus.NOT_FOUND.value(),
                        ApiError.builder().message(e.getMessage()).build()),
                HttpStatus.NOT_FOUND);
    }
}
