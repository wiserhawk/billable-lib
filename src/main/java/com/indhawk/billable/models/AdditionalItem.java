package com.indhawk.billable.models;

import java.math.BigDecimal;
import lombok.*;

@Data
@Getter
@Setter
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AdditionalItem {
    private String description;
    private BigDecimal additionalAmount;
}
