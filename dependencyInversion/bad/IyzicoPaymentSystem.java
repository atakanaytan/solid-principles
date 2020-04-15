package dependencyInversion.bad;

public class IyzicoPaymentSystem extends PaymentProvider{


    @Override
    public boolean cancelCharge(int chargeId) {

        System.out.println("Iyzico system has cancelled your "+chargeId+ " charge!");
        return true;
    }

    @Override
    public int charge(double totalPrice) {

        System.out.println("Iyzıco system charged ==> " + totalPrice);

        int chargeID = (int)Math.random() * 1000;

        super.addChargeToPreviousPayments(chargeID, totalPrice);

        return chargeID;
    }

    @Override
    public String loadInvoice(int chargeId) {

        //  find previous payment which payed with given id from the parameter
        double previousPaymentInvoice = super.getChargeFromPreviousPayments(chargeId);

        return String.valueOf(previousPaymentInvoice);
    }

}
