package dependencyInversion.bad;

public class DopingPaymentIntegrator implements PaymentIntegrator {

    private AssecoPaymentSystem assecoPaymentSystem;

    // Tightly coupled Dependency
    public DopingPaymentIntegrator(AssecoPaymentSystem assecoPaymentSystem) {
        this.assecoPaymentSystem = assecoPaymentSystem;
    }

    @Override
    public void makePayment(double totalPrice) {

        this.assecoPaymentSystem.charge(totalPrice);
    }

}
