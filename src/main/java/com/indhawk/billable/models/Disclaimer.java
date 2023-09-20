package com.indhawk.billable.models;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@ToString
public class Disclaimer {
    private long id;
    private String disclaimer;
}
