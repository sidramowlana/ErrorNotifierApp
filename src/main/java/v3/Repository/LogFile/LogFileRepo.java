package v3.Repository.LogFile;

import v3.Notification.Notification;
import v3.models.Application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LogFileRepo implements LogFileRepository {
    List<String> logList = new ArrayList<>();
    String logList1;
    String logs;
    Notification notification = null;

    @Override
    public List<String> getLogFile(List<Application> appList) throws IOException {
        for (Application app : appList) {
            logs = String.valueOf(Files.readAllLines(Paths.get(app.getLog_file())));
        }
        logList.add(logs);
        System.out.println("logssss :" + logs);
        return logList;
    }
}


//
