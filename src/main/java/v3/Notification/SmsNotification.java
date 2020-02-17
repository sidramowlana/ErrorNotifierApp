package v3.Notification;

import v3.Notification.Notification;

public class SmsNotification implements Notification {
    private String name;
    public SmsNotification(String name) {
       this.name = name;
    }

    @Override
    public void displayMessage() {
        System.out.println("Sending SMS v2.Notification to "+name);
    }
}
