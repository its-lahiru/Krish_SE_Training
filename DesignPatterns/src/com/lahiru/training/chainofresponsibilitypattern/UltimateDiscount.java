package com.lahiru.training.chainofresponsibilitypattern;

public class UltimateDiscount extends Handler {

    @Override
    public double applyDiscount(Invoice invoice) {
        invoice.setDiscount(invoice.getTotalAmount() * 0.25);
        System.out.println("Calculating ultimate discount");
        if ((invoice.getTotalAmount() >= 3000) && (invoice.getRoyaltyMembershipType() == "Ultimate")){
            return invoice.getDiscount();
        } else {
            return successor.applyDiscount(invoice);
        }
    }
}
