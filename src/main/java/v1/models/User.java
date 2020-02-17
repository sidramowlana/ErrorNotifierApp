package v1.models;

public class User {
    private String name;
    private String email;
    private String phone;
    private String[]notificationTypes;


    public User() {
    }

    public User(String name, String email, String phone, String[] notificationTypes) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.notificationTypes = notificationTypes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String[] getNotificationTypes() {
        return notificationTypes;
    }

    public void setNotificationTypes(String[] notificationTypes) {
        this.notificationTypes = notificationTypes;
    }
}
