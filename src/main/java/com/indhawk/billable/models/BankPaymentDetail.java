package com.indhawk.billable.models;

import lombok.*;

@Data
@Getter
@Setter
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BankPaymentDetail {
    private String bankName;
    private String branch;
    private String accountNumber;
    private String ifsc;
}
