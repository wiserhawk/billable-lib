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
public class BillableItem {
    /** Name of items    */
    private String itemName;
    /** Item unit e.g. g, kg, l, ml etc. */
    private String unit;
    /** Number of items  */
    private int quantity;
    /** Price of a single item    */
    private BigDecimal price;
    /** BillableCategory is tax category under which item lies.
     * All taxes will be calculate based on that category tax percentage.
     */
    private TaxCategory taxCategory;
    /** Total price amount of all items without taxes. e.g. price * quantity  */
    private BigDecimal amount;
    /** Total SGST tax amount of all items. e.g. amount * 5(sgst) / 100   */
    private BigDecimal sgstAmount;
    /** Total CGST tax amount of all items. e.g. amount * 5(cgst) / 100   */
    private BigDecimal cgstAmount;
    /** Total IGST tax amount of all items. e.g. amount * 5(igst) / 100   */
    private BigDecimal igstAmount;
    /** Total GST tax amount of all items. e.g. sgstAmount + cgstAmount + igstAmount  */
    private BigDecimal gstAmount;
    /** Total CESS tax amount of all items. e.g. amount * 2(cess) / 100   */
    private BigDecimal cessAmount;
    /** Total amount of taxes on all items.. e.g.  gstAmount + cessAmount */
    private BigDecimal taxedAmount;
    /** Net amount of items inculded all taxes. e.g.  amount + taxedAmount */
    private BigDecimal billableAmount;
}
