package com.example.bookstore.exception;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ExceptionMessage {
    private int status;
    private String reason;
    private long time;

    public ExceptionMessage() {
    }

    public ExceptionMessage(int status, String message, long time) {
        this.status = status;
        this.reason = message;
        this.time = time;
    }


}
