package v1;

import v2.Notification.EmailNotification;
import v2.Notification.EmailSMSNotification;
import v2.Notification.Notification;
import v2.Notification.SmsNotification;
import v2.Repository.Json.FileJsonRepo;
import v2.Repository.Json.FileJsonRepository;
import v2.models.Application;
import v2.models.User;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        List<User> userList;
        List<String> errorLog;
        List<Application> appList;
        List<String> logList;
        Notification notification = null;

        FileJsonRepository fileJsonRepo = new FileJsonRepo();
        appList = fileJsonRepo.getFile();

        for (Application app : appList) {
            List<String> logs = Files.readAllLines(Paths.get(app.getLog_file()));
            for (int i = 0; i < logs.size(); i++) {
                logList = Arrays.asList(logs.get(i).split(" "));
                if (logList.contains("Error")) {
                    for (int j = 0; j < app.getUsers().size(); j++) {
                        if (Arrays.toString(app.getUsers().get(j).getNotificationTypes()).contains("email") && Arrays.toString(app.getUsers().get(j).getNotificationTypes()).contains("sms")) {
                            notification = new EmailSMSNotification(app.getUsers().get(j).getName());
                            notification.displayMessage();
                        } else if (Arrays.toString(app.getUsers().get(j).getNotificationTypes()).contains("email")) {
                            notification = new EmailNotification(app.getUsers().get(j).getName());
                            notification.displayMessage();
                        } else if (Arrays.toString(app.getUsers().get(j).getNotificationTypes()).contains("sms")) {
                            notification = new SmsNotification(app.getUsers().get(j).getName());
                            notification.displayMessage();
                        }
                    }
                }
            }
        }
    }
}




