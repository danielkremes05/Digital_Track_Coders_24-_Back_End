package factoryMethod.notificationFactory;

import factoryMethod.notification.Email;
import factoryMethod.notification.Notification;
import factoryMethod.notification.Push;
import factoryMethod.notification.SMS;

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

