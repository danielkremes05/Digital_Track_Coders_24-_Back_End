package factoryMethod.notificationFactory;

import factoryMethod.notification.Notification;

public abstract class NotificationFactory {

    public abstract Notification creationNotificationEmail ();

    public abstract Notification creationNotificationSMS ();

    public abstract Notification creationNotificationPush ();

}
