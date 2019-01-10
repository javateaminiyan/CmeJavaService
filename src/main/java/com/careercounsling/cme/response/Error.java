package com.careercounsling.cme.response;

import org.springframework.http.HttpStatus;

public class Error {

    private HttpStatus Status;
    private String message;

    public Error() {
    }

    public Error(HttpStatus status, String message) {
        Status = status;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return Status;
    }

    public void setStatus(HttpStatus status) {
        Status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
