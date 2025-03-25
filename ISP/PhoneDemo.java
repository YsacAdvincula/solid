package ISP;

public class PhoneDemo {
    public static void main(String[] args) {
        System.out.println("BasicPhone:");
        BasicPhone basicPhone = new BasicPhone();
        basicPhone.makeCall("+3321567123");
        basicPhone.sendSMS("+09950441548", "Hello! I am texting from BasicPhone!");
        
        System.out.println("\nSmartPhone:");
        Smartphone smartPhone = new Smartphone();
        smartPhone.makeCall("+6969696969");
        smartPhone.sendSMS("+9696969696", "Hello! I am texting from SmartPhone!");
        smartPhone.browseWeb("https://www.youtube.com");
        smartPhone.takePicture();
    }
}