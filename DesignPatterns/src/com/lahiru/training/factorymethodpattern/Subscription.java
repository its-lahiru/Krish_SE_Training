package com.lahiru.training.factorymethodpattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Subscription {

    protected List<Features> features = new ArrayList<>();

    public Subscription() {
        createSubscription();
    }

    protected abstract void createSubscription();

    @Override
    public String toString() {
        return "Subscription{" +
                "features=" + features +
                '}';
    }
}
