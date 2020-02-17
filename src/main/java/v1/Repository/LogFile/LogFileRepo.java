package v1.Repository.LogFile;

import v1.models.Application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LogFileRepo implements LogFileRepository {
    List<String> logList = new ArrayList<String>();
    String logList1;

    @Override
    public List<String> getLogFile(List<Application> appList) throws IOException {
        for (Application app : appList) {
            List<String> logs = Files.readAllLines(Paths.get(app.getLog_file()));
            for (int i = 0; i < logs.size(); i++) {
                logList1= Arrays.toString(logs.get(i).split(" "));
            }
            logList.add(logList1);
        }
        return logList;
    }
}



























//
