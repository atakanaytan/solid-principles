package dependencyInversion.good.paymentIntegratorImpl;

import dependencyInversion.good.PaymentIntegrator;
import dependencyInversion.good.PaymentProvider;

public class ClassifiedPaymentIntegrator implements PaymentIntegrator {

    private PaymentProvider paymentProvider;

    public ClassifiedPaymentIntegrator(PaymentProvider paymentProvider) {
        this.paymentProvider = paymentProvider;
    }

    @Override
    public void makePayment(double totalPrice) {

        this.paymentProvider.charge(totalPrice);
    }
}
