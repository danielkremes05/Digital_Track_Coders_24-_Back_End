package factoryMethod.Main;

import factoryMethod.Notification.Notification;
import factoryMethod.notificationFactory.NotificationFactory;
import factoryMethod.notificationFactory.NotificationsBehaviors;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args) {

        List<String> storeNotifications = new ArrayList<>();
        String result = " ";

        NotificationFactory alertsNotifications;
        alertsNotifications = new NotificationsBehaviors();
        Notification notificationEmail = alertsNotifications.creationNotificationEmail();
        result = notificationEmail.notifyUser("Daniel", "danielrenatokremes@gmail.com");
        storeNotifications.add(result);

        alertsNotifications = new NotificationsBehaviors();
        Notification notificationSMS = alertsNotifications.creationNotificationSMS();
        result = notificationSMS.notifyUser("Daniel", "danielrenatokremes@gmail.com");
        storeNotifications.add(result);

        alertsNotifications = new NotificationsBehaviors();
        Notification notificationPush = alertsNotifications.creationNotificationPush();
        result = notificationPush.notifyUser("Daniel", "danielrenatokremes@gmail.com");
        storeNotifications.add(result);

        for (String value : storeNotifications) {
            System.out.println(value);
        }

    }
}
