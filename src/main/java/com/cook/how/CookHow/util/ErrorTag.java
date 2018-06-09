package com.cook.how.CookHow.util;

public class ErrorTag {

    public String message;
    public String payload;

    public ErrorTag(String message, String payload) {
        this.message = message;
        this.payload = payload;
    }

    public ErrorTag(String message) {
        this.message = message;
    }
}
