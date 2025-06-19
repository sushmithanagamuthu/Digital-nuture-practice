public class Main {
    public static void main(String[] args) {
        PaymentProcessor stripePayment = new StripeAdapter();
        stripePayment.processPayment(500.0);

        PaymentProcessor paypalPayment = new PayPalAdapter();
        paypalPayment.processPayment(750.0);
    }
}
