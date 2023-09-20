package com.indhawk.billable.models;

import lombok.*;

@Data
@Getter
@Setter
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Discount {
    private String name;
    private String description;
    private DiscountType discountType;
    private int discount;
}
