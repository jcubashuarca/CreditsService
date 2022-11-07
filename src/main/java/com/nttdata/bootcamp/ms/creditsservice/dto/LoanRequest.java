package com.nttdata.bootcamp.ms.creditsservice.dto;

import com.nttdata.bootcamp.ms.creditsservice.model.Loan;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.validation.constraints.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Slf4j

public class LoanRequest {
    private String id;

    @NotBlank
    private String client;

    @Positive
    @NotNull
    private double amount;

    @NotNull
    @Min(value = 1)
    @Max(value = 25)
    private int paymentDay;

    @NotNull
    private double fullPayments;
    @NotNull
    private int numberInstallments;


    public Loan toModel() {
        return Loan.builder()
                .client(this.client)
                .amount(this.amount)
                .balance(0)
                .paymentDay(this.paymentDay)
                .fullPayment(this.fullPayments)
                .numberInstallments(this.numberInstallments)
                .build();
    }
}
