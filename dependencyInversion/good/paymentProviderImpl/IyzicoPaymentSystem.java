package dependencyInversion.good.paymentProviderImpl;

import dependencyInversion.good.PaymentProvider;

public class IyzicoPaymentSystem extends PaymentProvider {

    @Override
    public boolean cancelCharge(int chargeId) {

        System.out.println("Iyzıco system cancelled your " +chargeId+ " charge!");

        return true;
    }

    @Override
    public int charge(double totalPrice) {

        System.out.println("Iyzico system charged ==> " +totalPrice);

        int chargeID = (int)Math.random() * 1000;

        super.addChargeToPreviousPayments(chargeID, totalPrice);

        return chargeID;
    }

    @Override
    public String loadInvoice(int chargeId) {

        double previousInvoice = super.getChargeFromPreviousPayments(chargeId);

        return String.valueOf(previousInvoice);
    }

}
