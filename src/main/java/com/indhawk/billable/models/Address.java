package com.indhawk.billable.models;

import lombok.*;

@Data
@Getter
@Setter
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Address {
    private String toName;
    private String line1;
    private String line2;
    private String city;
    private String state;
    private String pincode;
    private String phone;
    private String emailId;
}
