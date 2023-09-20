package com.indhawk.billable.models;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@ToString
public class Customer {
    private int customerId;
    private String name;
    private Address address;
    private String gstin;
    private String logo;
}
