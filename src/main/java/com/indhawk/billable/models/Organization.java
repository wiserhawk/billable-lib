package com.indhawk.billable.models;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@ToString
public class Organization {
    private int orgId;
    private String orgName;
    private Address address;
    private String gstin;
    private String logo;
}
