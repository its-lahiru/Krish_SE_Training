package factorymethodpattern;

public class PremiumSubscription extends Subscription {

    @Override
    protected void createSubscription() {
        features.add(new MalwareBlocker());
        features.add(new WebCamSpyBlocker());
        features.add(new AutomaticAppUpdater());
    }

}
