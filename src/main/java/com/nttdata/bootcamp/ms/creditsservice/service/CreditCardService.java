package com.nttdata.bootcamp.ms.creditsservice.service;

import com.nttdata.bootcamp.ms.creditsservice.dto.CreditCardRequest;
import com.nttdata.bootcamp.ms.creditsservice.dto.CreditCardResponse;
import com.nttdata.bootcamp.ms.creditsservice.dto.CreditReportResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDate;

public interface CreditCardService {

    Flux<CreditCardResponse> findAllCreditCars();

    Mono<CreditCardResponse> getById(String id);

    Flux<CreditCardResponse> getAllCreditCardsByClient(String client);

    Mono<CreditReportResponse> getReport(String id, LocalDate from, LocalDate to);

    Mono<CreditCardResponse> saveCreditCard(CreditCardRequest creditCardRequestMono);

    Mono<CreditCardResponse> updateCreditCard(String id, CreditCardRequest creditCardRequest);

    Mono<Void> deleteCreditCard(String id);
}
