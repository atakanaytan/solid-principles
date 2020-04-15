package dependencyInversion.good.paymentProviderImpl;

import dependencyInversion.good.PaymentProvider;

public class AssecoPaymentSystem extends PaymentProvider {

    @Override
    public boolean cancelCharge(int chargeId) {

        return false;
    }

    @Override
    public int charge(double totalPrice) {

        System.out.println("Asseco system charged ==> " + totalPrice);

        int chargeID = (int)Math.random() * 10000;

        super.addChargeToPreviousPayments(chargeID, totalPrice);

        return chargeID;
    }

    @Override
    public String loadInvoice(int chargeId) {

         double previousPaymentInvoice = super.getChargeFromPreviousPayments(chargeId);

         return String.valueOf(previousPaymentInvoice);
    }
}
