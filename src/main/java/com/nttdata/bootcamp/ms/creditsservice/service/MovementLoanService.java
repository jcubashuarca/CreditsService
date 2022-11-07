package com.nttdata.bootcamp.ms.creditsservice.service;

import com.nttdata.bootcamp.ms.creditsservice.dto.MovementRequest;
import com.nttdata.bootcamp.ms.creditsservice.dto.MovementResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MovementLoanService {
    Flux<MovementResponse> getAll();

    Mono<MovementResponse> getById(String id);

    Flux<MovementResponse> getAllMovementsByLoan(String loan);

    Mono<Double> getStateByLoanPerMonthAndYear(String loan, int year, int month);

    Mono<Void> delete(String id);

    Mono<Void> deleteAll();

    Mono<MovementResponse> save(MovementRequest movementRequest);

}
