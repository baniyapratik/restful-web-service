package com.rest.webservices.restfulwebservices.exception;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class ErrorDetails {
    // timestamp when the error happened
    private LocalDateTime timestamp;
    // message
    private String message;
    // details of the error
    private String details;

    public ErrorDetails(LocalDateTime timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
