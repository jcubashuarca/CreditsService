package com.nttdata.bootcamp.ms.creditsservice.service;

import com.nttdata.bootcamp.ms.creditsservice.dto.LoanRequest;
import com.nttdata.bootcamp.ms.creditsservice.dto.LoanResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface LoanService {

    Flux<LoanResponse> findAllLoans();

    Flux<LoanResponse> getAllLoansByClient(String client);

    Mono<LoanResponse> saveLoan(Mono<LoanRequest> loanRequest);

    Mono<LoanResponse> update(String id, LoanRequest loanRequest);

    Mono<Void> delete(String id);

}
