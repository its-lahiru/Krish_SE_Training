package com.lahiru.training.chainofresponsibilitypattern;

public class BasicDiscount extends Handler{

    @Override
    public double applyDiscount(Invoice invoice) {
        invoice.setDiscount(invoice.getTotalAmount() * 0.05);
        System.out.println("Calculating basic discount");
        if ((invoice.getTotalAmount() < 1000) && (invoice.getRoyaltyMembershipType() == "Basic")){
            return invoice.getDiscount();
        } else {
            return successor.applyDiscount(invoice);
        }

    }
}
