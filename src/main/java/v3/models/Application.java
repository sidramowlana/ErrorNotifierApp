package v3.models;

import v3.models.User;

import java.util.List;

public class Application {

    private String log_file;
    private String application_name;
    private List<User> users;

    public Application() {
    }

    public Application(String log_file, String application_name, List<User> users) {
        this.log_file = log_file;
        this.application_name = application_name;
        this.users = users;
    }

    public String getLog_file() {
        return log_file;
    }

    public void setLog_file(String log_file) {
        this.log_file = log_file;
    }

    public String getApplication_name() {
        return application_name;
    }

    public void setApplication_name(String application_name) {
        this.application_name = application_name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}