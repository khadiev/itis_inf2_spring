package com.example.web2;

public class RequestMessage {
    private String message;

    public RequestMessage(String message) {
        this.message = message;
    }

    public RequestMessage() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
