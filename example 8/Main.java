import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose payment method: 1. Credit Card  2. PayPal");
        int choice = scanner.nextInt();

        if (choice == 1) {
            context.setPaymentStrategy(new CreditCardPayment());
        } else if (choice == 2) {
            context.setPaymentStrategy(new PayPalPayment());
        } else {
            System.out.println("Invalid choice.");
            return;
        }

        context.payAmount(250.0);
        scanner.close();
    }
}