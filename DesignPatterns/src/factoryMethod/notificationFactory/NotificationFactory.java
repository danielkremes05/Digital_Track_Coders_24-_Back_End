package factoryMethod.notificationFactory;

import factoryMethod.Notification.Notification;

public abstract class NotificationFactory {

    public abstract Notification creationNotificationEmail ();

    public abstract Notification creationNotificationSMS ();

    public abstract Notification creationNotificationPush ();

}
