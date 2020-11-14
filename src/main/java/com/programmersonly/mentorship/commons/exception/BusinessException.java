package com.programmersonly.mentorship.commons.exception;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RequiredArgsConstructor
@Getter
public class BusinessException extends RuntimeException {
    private final ResponseEntity<? extends ErrorResponse> response;

    public BusinessException(HttpStatus status, ErrorResponse response) {
        this(new ResponseEntity<>(response, status));
    }

    public static BusinessException ex404(ErrorResponse response){
        return new BusinessException(HttpStatus.NOT_FOUND, response);
    }

    public static BusinessException ex409(ErrorResponse response){
        return new BusinessException(HttpStatus.CONFLICT, response);
    }
}
