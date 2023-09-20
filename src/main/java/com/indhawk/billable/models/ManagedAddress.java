package com.indhawk.billable.models;

import lombok.*;

@Data
@Getter
@Setter
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ManagedAddress {
    private int orgId;
    private int addressId;
    // String to Identify address
    private String addressIdentifier;
    private Address address;
}
