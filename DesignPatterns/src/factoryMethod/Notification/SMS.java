package factoryMethod.Notification;

public class SMS implements Notification {
    @Override
    public String notifyUser (String name, String email) {
        return name + ", send to SMS: " + email;
    }
}


