package DIP;

public class PaymentApp {
    public static void main(String[] args) {
        PaymentProcessor eWalletPayment = new PaymentProcessor(new Ewallet());
        PaymentProcessor cashPayment = new PaymentProcessor(new Cash());
        PaymentProcessor creditCardPayment = new PaymentProcessor(new CreditCard());

        
        System.out.println("\nPayment Modes:");
        eWalletPayment.processPayment(6999.0);
        cashPayment.processPayment(1000.0);
        creditCardPayment.processPayment(25000.0);
    }
}