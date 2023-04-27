package com.miraouy.Exception.ModuleF;

import com.miraouy.Exception.MessageError;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
public class HandlerModuleExeptions {
    @ExceptionHandler
    public ResponseEntity<Object> handleNoteNotFound(ModuleNotFound ex, WebRequest request) {
        MessageError errorB = new MessageError();
        errorB.setTimestamp(new Date());
        errorB.setStatus(HttpStatus.BAD_REQUEST.value());
        errorB.setError(HttpStatus.BAD_REQUEST.name());
        errorB.setMessage(ex.getMessage());
        return new ResponseEntity<>(errorB, new HttpHeaders(), HttpStatus.BAD_REQUEST);
    }
}
