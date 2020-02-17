package v1.Repository.LogFile;

import v1.models.Application;

import java.io.IOException;
import java.util.List;

public interface LogFileRepository {
    public List<String> getLogFile(List<Application> logName) throws IOException;
}
