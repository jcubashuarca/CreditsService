package com.nttdata.bootcamp.ms.creditsservice.service;

import com.nttdata.bootcamp.ms.creditsservice.dto.BillingRequest;
import com.nttdata.bootcamp.ms.creditsservice.dto.BillingResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BillingCreditCardService {

    Flux<BillingResponse> getBillingByCredit(String credit);

    Mono<Boolean> isDebt(String client);
    Mono<BillingResponse> save(BillingRequest billingRequest);

    Mono<BillingResponse> disableBilling(String id);
}
