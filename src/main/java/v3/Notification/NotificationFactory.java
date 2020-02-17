package v3.Notification;

import v3.Notification.EmailNotification;
import v3.Notification.EmailSMSNotification;
import v3.Notification.Notification;
import v3.Notification.SmsNotification;
import v3.models.User;

import java.util.Arrays;
import java.util.List;

public class NotificationFactory {
    Notification notification = null;

    public void getAlert(List<String> logList, List<User> userList) {
        if (logList.contains("Error")) {
            for (int j = 0; j < userList.size(); j++) {
                if (Arrays.toString(userList.get(j).getNotificationTypes()).contains("email") && Arrays.toString(userList.get(j).getNotificationTypes()).contains("sms")) {
                    notification = new EmailSMSNotification(userList.get(j).getName());
                    notification.displayMessage();
                } else if (Arrays.toString(userList.get(j).getNotificationTypes()).contains("email")) {
                    notification = new EmailNotification(userList.get(j).getName());
                    notification.displayMessage();
                } else if (Arrays.toString(userList.get(j).getNotificationTypes()).contains("sms")) {
                    notification = new SmsNotification(userList.get(j).getName());
                    notification.displayMessage();
                }
            }
        }
    }
}