package com.nttdata.bootcamp.ms.creditsservice.dto;

import com.nttdata.bootcamp.ms.creditsservice.model.CreditCard;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class CreditReportResponse {
    private String id;
    private String client;
    private double amount;
    private double balance;
    private String number;
    private int billingDay;

    private List<BillingResponse> billings;
    private List<MovementResponse> movements;

    public static CreditReportResponse fromModel(CreditCard creditCard) {
        return CreditReportResponse.builder()
                .id(creditCard.getId())
                .client(creditCard.getClient())
                .amount(creditCard.getAmount())
                .balance(creditCard.getBalance())
                .number(creditCard.getNumber())
                .billingDay(creditCard.getBillingDay())
                .build();
    }

}
