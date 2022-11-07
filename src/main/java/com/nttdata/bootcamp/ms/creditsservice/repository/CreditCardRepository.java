package com.nttdata.bootcamp.ms.creditsservice.repository;

import com.nttdata.bootcamp.ms.creditsservice.model.CreditCard;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface CreditCardRepository extends ReactiveMongoRepository<CreditCard, String> {
    Flux<CreditCard> findCreditCardsByClient(String client);
}
