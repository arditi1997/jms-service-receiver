package com.jms.receiver.service.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    BAD_REQUEST(1000, Constants.BAD_REQUEST);

    private final long code;
    private final String message;
    public static class Constants{
        public final static String BAD_REQUEST = "Please check again your inputs!";
    }
}
