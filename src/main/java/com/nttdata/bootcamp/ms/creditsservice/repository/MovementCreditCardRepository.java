package com.nttdata.bootcamp.ms.creditsservice.repository;
import com.nttdata.bootcamp.ms.creditsservice.model.MovementCreditCard;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

import java.time.LocalDate;

public interface MovementCreditCardRepository extends ReactiveMongoRepository<MovementCreditCard, String> {

    Flux<MovementCreditCard> findByCredit(String account);

    Flux<MovementCreditCard> findByCreditOrderByCreatedAtDesc(String account);

    Flux<MovementCreditCard> findByCreditAndDateBetween(String credit, LocalDate from, LocalDate to);

}
