package com.jms.receiver.service.exception;

import lombok.Getter;

@Getter
public class CustomException extends RuntimeException{
    private final ErrorCode code;
    private String details;

    public CustomException(ErrorCode code, String details){
        super(code.getMessage());
        this.details = details;
        this.code = code;
    }

    public CustomException(ErrorCode code){
        super(code.getMessage());
        this.details = code.getMessage();
        this.code = code;
    }
}
