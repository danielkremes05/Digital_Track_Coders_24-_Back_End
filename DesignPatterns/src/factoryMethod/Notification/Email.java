package factoryMethod.Notification;

public class Email implements Notification {
    @Override
    public String notifyUser (String name, String email) {
        return name + ", send to email: " + email;
    }
}
