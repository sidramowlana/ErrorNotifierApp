package v3.Notification;

import v3.Notification.Notification;

public class EmailNotification implements Notification {
private String name;
    public EmailNotification(String name) {
        this.name = name;
    }

    @Override
    public void displayMessage() {
        System.out.println("Sending email notification to "+name);
    }
}
