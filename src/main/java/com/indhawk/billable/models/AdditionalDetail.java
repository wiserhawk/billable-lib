package com.indhawk.billable.models;

import lombok.*;
import java.util.List;

@Data
@Getter
@Setter
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AdditionalDetail {
    List<AdditionalItem> additionalItems;
}
