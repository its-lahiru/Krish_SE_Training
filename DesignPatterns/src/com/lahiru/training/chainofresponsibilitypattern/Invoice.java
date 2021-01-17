package com.lahiru.training.chainofresponsibilitypattern;

public class Invoice {

    private int invoiceId;
    private double totalAmount;
    private String royaltyMembershipType;
    private double discount;

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Invoice(int invoiceId, double totalAmount, String royaltyMembershipType) {
        this.invoiceId = invoiceId;
        this.totalAmount = totalAmount;
        this.royaltyMembershipType = royaltyMembershipType;
        this.discount = discount;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getRoyaltyMembershipType() {
        return royaltyMembershipType;
    }

    public double getDiscount() {
        return discount;
    }
}
