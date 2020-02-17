package v3.ManageUser;

import v3.ManageUser.ManageUserApp;
import v3.models.Application;
import v3.models.User;

import java.util.ArrayList;
import java.util.List;

public class ManageUser implements ManageUserApp {
    List<User> userList = new ArrayList<>();
    Application application = new Application();

    @Override
    public List<User> getUserName(List<Application> appList) {
            for (int i = 0; i < appList.size(); i++) {
                application.setUsers(appList.get(i).getUsers());
                for (int j = 0; j < application.getUsers().size(); j++) {
                    userList.add(application.getUsers().get(j));
                }
            }
            return userList;
        }

}
