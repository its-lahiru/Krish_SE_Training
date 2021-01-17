package com.lahiru.training.chainofresponsibilitypattern;

public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract double applyDiscount(Invoice invoice);
}
