package dependencyInversion.bad;

public interface PaymentIntegrator {

    public void makePayment(double totalPrice);
}
