package dependencyInversion.bad;

public class ClassifiedPaymentIntegrator implements PaymentIntegrator{

    // Tightly coupled Dependency
    private IyzicoPaymentSystem ıyzicoPaymentSystem;

    public ClassifiedPaymentIntegrator(IyzicoPaymentSystem ıyzicoPaymentSystem) {

        this.ıyzicoPaymentSystem = ıyzicoPaymentSystem;
    }


    @Override
    public void makePayment(double totalPrice) {

        this.ıyzicoPaymentSystem.charge(totalPrice);
    }
}
