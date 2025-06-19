public class PayPalAdapter implements PaymentProcessor {
    private PayPalGateway paypal;

    public PayPalAdapter() {
        this.paypal = new PayPalGateway();
    }

    public void processPayment(double amount) {
        paypal.sendPayment(amount);
    }
}
