package v3.ManageLogApp;

import v3.ManageLogApp.ManageLogApp;
import v3.models.Application;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManageLog implements ManageLogApp {
    Application application = new Application();
    List<String> logAppName;
    List<String> logName;
    List<String> logNameList = new ArrayList<>();

    @Override
    public List<String> getErrorLog(List<String> logs) {
        //split
        for(int i=0;i<logs.size();i++) {
          logName = Arrays.asList(logs.get(i).split(" "));
          if(logName.contains("Error")){
              return logName;
          }
        }
        return logName;
    }
}
