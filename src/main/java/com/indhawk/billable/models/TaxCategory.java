package com.indhawk.billable.models;

import lombok.*;

import java.math.BigDecimal;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@ToString
public class TaxCategory {
    private int taxCategoryId;
    private String name;
    private String hsnCode;
    //SGST percentage
    private BigDecimal sgst;
    //CGST percentage
    private BigDecimal cgst;
    //IGST percentage
    private BigDecimal igst;
    //Total GST percentage
    private BigDecimal gst;
    //CESS percentage
    private BigDecimal cess;
    private int orgId;
}
