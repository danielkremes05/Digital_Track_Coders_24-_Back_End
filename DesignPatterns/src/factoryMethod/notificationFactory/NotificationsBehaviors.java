package factoryMethod.notificationFactory;

import factoryMethod.Notification.Email;
import factoryMethod.Notification.Notification;
import factoryMethod.Notification.Push;
import factoryMethod.Notification.SMS;

public class NotificationsBehaviors extends NotificationFactory {

    @Override
    public Notification creationNotificationEmail () {
        return new Email();
    }

    @Override
    public Notification creationNotificationSMS () {
        return new SMS();
    }

    @Override
    public Notification creationNotificationPush () {
        return new Push();
    }
}

