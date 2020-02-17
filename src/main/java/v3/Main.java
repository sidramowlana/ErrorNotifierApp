package v3;

import v3.ManageLogApp.ManageLog;
import v3.ManageLogApp.ManageLogApp;
import v3.ManageUser.ManageUser;
import v3.ManageUser.ManageUserApp;
import v3.Notification.Notification;
import v3.Notification.NotificationFactory;
import v3.Repository.Json.FileJsonRepo;
import v3.Repository.Json.FileJsonRepository;
import v3.Repository.LogFile.LogFileRepo;
import v3.Repository.LogFile.LogFileRepository;
import v3.models.Application;
import v3.models.User;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        List<User> userList;
        List<Application> appList;
        List<String> logName;
        Notification notification = null;

        FileJsonRepository fileJsonRepo = new FileJsonRepo();
        appList = fileJsonRepo.getFile();

        LogFileRepository logFileRepo = new LogFileRepo();
        List<String> logs = logFileRepo.getLogFile(appList);
        System.out.println("logs : "+ logs);

        ManageLogApp manageLogApp = new ManageLog();
        logName = manageLogApp.getErrorLog(logs);
        System.out.println("logName : "+logName);
//
//        //get users
        ManageUserApp manageUserApp = new ManageUser();
        userList = manageUserApp.getUserName(appList);
        System.out.println("userList: " + userList);
////
////        notify
//        NotificationFactory notificationFactory = new NotificationFactory();
//        notificationFactory.getAlert(logs,userList);
    }
}


