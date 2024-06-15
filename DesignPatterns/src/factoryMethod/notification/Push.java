package factoryMethod.notification;

public class Push implements Notification {
    @Override
    public String notifyUser (String name, String email) {
        return name + ", send to PUSH: " + email;
    }
}


