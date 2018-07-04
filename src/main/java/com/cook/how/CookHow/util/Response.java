package com.cook.how.CookHow.util;

import org.springframework.http.HttpStatus;

public class Response {

    private String message;
    private HttpStatus httpStatus;
    private String payload;

    public Response(HttpStatus httpStatus , String message){
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public Response(HttpStatus httpStatus , String message, String payload){
        this.message = message;
        this.httpStatus = httpStatus;
        this.payload = payload;
    }

    public String getMessage() {
        return message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public String getPayload() {
        return payload;
    }
}
