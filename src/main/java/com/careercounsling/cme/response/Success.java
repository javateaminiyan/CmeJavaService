package com.careercounsling.cme.response;

import org.springframework.http.HttpStatus;

import java.util.List;

public class Success {

    private HttpStatus Status;
    private Object Response;

    public Success() {
    }

    public Success(HttpStatus status, Object response) {
        Status = status;
        Response = response;
    }

    public HttpStatus getStatus() {
        return Status;
    }

    public void setStatus(HttpStatus status) {
        Status = status;
    }

    public Object getResponse() {
        return Response;
    }

    public void setResponse(Object response) {
        Response = response;
    }
}
