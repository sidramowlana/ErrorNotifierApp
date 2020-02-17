package v3.Notification;

import v3.Notification.Notification;

public class EmailSMSNotification  implements Notification {
    private String name;
    public EmailSMSNotification(String name) {
        this.name = name;
    }

    @Override
    public void displayMessage() {
        System.out.println("Sending email and sms notification to "+name);
    }
}