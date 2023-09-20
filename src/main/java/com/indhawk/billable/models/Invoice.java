package com.indhawk.billable.models;

import lombok.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@ToString
public class Invoice implements Serializable {
    // internal unique invoice id
    private int invoiceId;
    private int version;
    private int orgId;
    private String invoiceNumber;
    private String name;
    // Purchase Order Number
    private String poNumber;
    private InvoiceCategory invoiceCategory;
    private Customer customer;
    private Address shipTo;
    private LocalDateTime dateTime;
    private LocalDateTime dueDate;
    private Billable billable;
    private Disclaimer disclaimer;
    private Discount discount;
    private AdditionalDetail additionalDetail;
    private BigDecimal totalItemsPrice;
    private BigDecimal totalSGSTAmount;
    private BigDecimal totalCGSTAmount;
    private BigDecimal totalIGSTAmount;
    private BigDecimal totalGSTAmount;
    private BigDecimal totalCESSAmount;
    private BigDecimal discountedAmount;
    private BigDecimal totalAdditionalAmount;
    private BigDecimal payableAmount;
    private InvoiceStatus status;
    private boolean deleted;
    private LocalDateTime lastUpdateDate;
    // Tag customer org id generated by Billable system. So that customer can see sent invoices on portal after login.
    private long customerOrgId;

}