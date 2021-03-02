package com.example.resservice.webservice.entity;

public class HelloWordBean {
    private String message;
    public HelloWordBean(String message) {
        this.message=message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "HelloWordBean{" +
                "message='" + message + '\'' +
                '}';
    }

    public void setMessage(String message) {
        this.message = message;

    }
}
