package dependencyInversion.bad;

public abstract class PaymentProvider {

    protected double[] previousPayments;

    public PaymentProvider() {
        this.previousPayments = new double[1000];
    }

    public double[] getPreviousPayments() {
        return previousPayments;
    }

    public void setPreviousPayments(double[] previousPayments) {
        this.previousPayments = previousPayments;
    }

    public void addChargeToPreviousPayments(int chargeId, double totalPrice) {
        this.previousPayments[chargeId] = totalPrice;
    }

    public double getChargeFromPreviousPayments(int chargeId) {
        return this.previousPayments[chargeId];
    }

    public abstract boolean cancelCharge(int chargeId);

    public abstract int charge(double totalPrice);

    public abstract String loadInvoice(int chargeId);
}
