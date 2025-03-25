package OpenClose;

public class DiscountApp {
    
    public static void main(String[] args) {
        Customer student = new Customer("Marty", new StudentDiscount());
        Customer seniorCitizen = new Customer("Tess", new SeniorDiscount());
        Customer regular = new Customer("Madison", new Regular());

        double amount = 100.0;

        System.out.println("Student Discount: " + student.applyDiscount(amount)); 
        System.out.println("Senior Citizen Discount: " + seniorCitizen.applyDiscount(amount)); 
        System.out.println("Regular Discount: " + regular.applyDiscount(amount)); 
    }
}