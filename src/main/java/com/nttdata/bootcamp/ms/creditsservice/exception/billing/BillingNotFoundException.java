package com.nttdata.bootcamp.ms.creditsservice.exception.billing;

public class BillingNotFoundException extends RuntimeException {
    public BillingNotFoundException(String message) {
        super(message);
    }
}
