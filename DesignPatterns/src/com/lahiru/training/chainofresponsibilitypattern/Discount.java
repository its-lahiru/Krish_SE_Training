package com.lahiru.training.chainofresponsibilitypattern;

public class Discount extends Handler {

    @Override
    public double applyDiscount(Invoice invoice) {
        return successor.applyDiscount(invoice);
    }
}
