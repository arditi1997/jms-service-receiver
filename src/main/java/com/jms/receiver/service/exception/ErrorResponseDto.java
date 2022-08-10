package com.jms.receiver.service.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorResponseDto {
    private long errorCode;
    private String details;

    public ErrorResponseDto(long errorCode){
        errorCode = this.errorCode;
    }
}
