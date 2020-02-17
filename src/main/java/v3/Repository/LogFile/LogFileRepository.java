package v3.Repository.LogFile;

import v3.models.Application;

import java.io.IOException;
import java.util.List;

public interface LogFileRepository {
    public List<String> getLogFile(List<Application> logName) throws IOException;
}
