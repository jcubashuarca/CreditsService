package com.nttdata.bootcamp.ms.creditsservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Document;

@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "loans")

public class Loan extends Credit {
    private double fullPayment;
    private int numberInstallments;
}
