package com.indhawk.billable.models;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EInvoice extends Invoice {
    private String irn;
    private String qrCode;
    private String ackNo;
    private boolean eInvoice;
    private LocalDateTime ackDateTime;
}
