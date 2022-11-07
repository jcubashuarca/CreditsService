package com.nttdata.bootcamp.ms.creditsservice.dto;

import com.nttdata.bootcamp.ms.creditsservice.model.BillingCreditCard;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BillingResponse {
    private String id;
    private String credit;
    private String client;
    private LocalDate lastDayPayment;
    private LocalDate billingDate;
    private double minPayment;
    private double fullPayment;
    private boolean active;

    public static BillingResponse fromModelBillingCreditCard(BillingCreditCard billingCreditCard) {
        return BillingResponse.builder()
                .id(billingCreditCard.getId())
                .credit(billingCreditCard.getCredit())
                .client(billingCreditCard.getClient())
                .lastDayPayment(billingCreditCard.getLastDayPayment())
                .billingDate(billingCreditCard.getBillingDate())
                .minPayment(billingCreditCard.getMinPayment())
                .fullPayment(billingCreditCard.getFullPayment())
                .active(billingCreditCard.isActive())
                .build();
    }
}
