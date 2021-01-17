package com.lahiru.training.factorymethodpattern;

public class SubscriptionFactory {

    public static Subscription createSubscription(SubscriptionCode subscriptionCode){

        switch (subscriptionCode){
            case FREE:
                return new FreeSubscription();
            case PREMIUM:
                return new PremiumSubscription();
            case ULTIMATE:
                return new UltimateSubscription();
            default:
                return null;
        }

    }

}
