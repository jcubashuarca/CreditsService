package com.nttdata.bootcamp.ms.creditsservice.exception.credit;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
@Slf4j
public class CreditNotFoundException extends RuntimeException {
    public CreditNotFoundException(String message) {
        super(message);
    }
}
