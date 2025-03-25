package ISP;

public class BasicPhone implements CallFeature, SMS {

    public void makeCall(String number){
        System.out.println("Calling " + number);
    }

    public void sendSMS(String number, String message){
        System.out.println("Texting " + number + message);
    }
}