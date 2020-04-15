package dependencyInversion.good.paymentIntegratorImpl;

import dependencyInversion.good.PaymentIntegrator;
import dependencyInversion.good.PaymentProvider;

public class DopingPaymentIntegrator implements PaymentIntegrator {

    private PaymentProvider paymentProvider;


    public DopingPaymentIntegrator(PaymentProvider paymentProvider) {
        this.paymentProvider = paymentProvider;
    }

    @Override
    public void makePayment(double totalPrice) {

        this.paymentProvider.charge(totalPrice);
    }
}
