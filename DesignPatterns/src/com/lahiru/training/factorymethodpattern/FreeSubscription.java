package com.lahiru.training.factorymethodpattern;

public class FreeSubscription extends Subscription {

    @Override
    protected void createSubscription() {
        features.add(new MalwareBlocker());
        features.add(new WebCamSpyBlocker());
    }
}
