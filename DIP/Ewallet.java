package DIP;

public class Ewallet implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("You are paying in Maya: " + amount);
    }
}