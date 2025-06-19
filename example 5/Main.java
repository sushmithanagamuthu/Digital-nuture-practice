public class Main {
    public static void main(String[] args) {
        
        Notifier notifier = new EmailNotifier();

        notifier = new SMSNotifierDecorator(notifier);

        notifier = new SlackNotifierDecorator(notifier);
        notifier.send("System Alert: Server Down!");
    }
}
