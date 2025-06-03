public class DependencyInversionPrinciple {

    // Abstract interface
    interface PaymentMethod {
        void pay(double amount);
    }

    // Concrete implementation 1
    static class CreditCardPayment implements PaymentMethod {
        public void pay(double amount) {
            System.out.println("Paying $" + amount + " with Credit Card.");
        }
    }

    // Concrete implementation 2
    static class PayPalPayment implements PaymentMethod {
        public void pay(double amount) {
            System.out.println("Paying $" + amount + " with PayPal.");
        }
    }

    // High-level class depends on abstraction
    static class PaymentProcessor {
        PaymentMethod method;

        public PaymentProcessor(PaymentMethod method) {
            this.method = method;
        }

        public void process(double amount) {
            method.pay(amount);
        }
    }

    public static void main(String[] args) {
        // Choose a payment method
        PaymentMethod method = new CreditCardPayment(); // or new PayPalPayment();

        // Inject into processor
        PaymentProcessor processor = new PaymentProcessor(method);

        // Process payment
        processor.process(99.99);
    }
}
