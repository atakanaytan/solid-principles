package dependencyInversion.good;

public interface PaymentIntegrator {

    public void makePayment(double totalPrice);
}
