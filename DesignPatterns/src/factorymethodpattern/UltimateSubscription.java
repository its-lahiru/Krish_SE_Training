package factorymethodpattern;

public class UltimateSubscription extends Subscription {

    @Override
    protected void createSubscription() {
        features.add(new MalwareBlocker());
        features.add(new WebCamSpyBlocker());
        features.add(new AutomaticAppUpdater());
        features.add(new VPNService());
    }
}
