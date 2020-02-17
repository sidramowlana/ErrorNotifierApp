package v3.ManageUser;

import v3.models.Application;
import v3.models.User;

import java.util.List;

public interface ManageUserApp {
    List<User> getUserName(List<Application> appList);

}
