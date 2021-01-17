package com.lahiru.training.chainofresponsibilitypattern;

public class PremiumDiscount extends Handler {

    @Override
    public double applyDiscount(Invoice invoice) {
        invoice.setDiscount(invoice.getTotalAmount() * 0.15);
        System.out.println("Calculating premium discount");
        if ((invoice.getTotalAmount() >= 2000) && (invoice.getTotalAmount() < 3000) && (invoice.getRoyaltyMembershipType() == "Premium")){
            return invoice.getDiscount();
        } else {
            return successor.applyDiscount(invoice);
        }
    }


}
