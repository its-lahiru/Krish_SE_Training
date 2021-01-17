package com.lahiru.training.chainofresponsibilitypattern;

public class StandardDiscount extends Handler {

    @Override
    public double applyDiscount(Invoice invoice) {
        invoice.setDiscount(invoice.getTotalAmount() * 0.09);
        System.out.println("Calculating standard discount");
        if ((invoice.getTotalAmount() >= 1000) && (invoice.getTotalAmount() < 2000) && (invoice.getRoyaltyMembershipType() == "Standard")){
            return invoice.getDiscount();
        } else {
            return successor.applyDiscount(invoice);
        }
    }

}
