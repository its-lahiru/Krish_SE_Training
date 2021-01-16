package factorymethodpattern;

public class Application {

    public static void main(String[] args) {

        Subscription subscription = SubscriptionFactory.createSubscription(SubscriptionCode.FREE);
        System.out.println(subscription);

        Subscription subscription1 = SubscriptionFactory.createSubscription(SubscriptionCode.PREMIUM);
        System.out.println(subscription1);

        Subscription subscription2 = SubscriptionFactory.createSubscription(SubscriptionCode.ULTIMATE);
        System.out.println(subscription2);

    }

}
