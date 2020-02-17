package v3.ManageLogApp;

import v3.models.Application;

import java.util.List;

public interface ManageLogApp {
    List<String> getErrorLog(List<String> logs);

}
