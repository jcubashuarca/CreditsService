package com.nttdata.bootcamp.ms.creditsservice.repository;

import com.nttdata.bootcamp.ms.creditsservice.model.Loan;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface LoanRepository extends ReactiveMongoRepository<Loan, String> {
    Flux<Loan> findLoansByClient(String client);
}
