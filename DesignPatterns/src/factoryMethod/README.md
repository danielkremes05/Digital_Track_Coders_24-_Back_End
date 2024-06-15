# Studies About Design Patterns in Java

## Folders Design Patterns - ``Factory Method``

### Structure Folder

```plaintext
📁 factoryMethod
├── 📁 main
│   ├── 📜 Main.java
├── 📁 notification
│   ├── 📜 Email.java
│   └── 📜 Notification.java
│   └── 📜 Push.java
│   └── 📜 SMS.java
└── 📁 notificationFactory
    ├── 📜 NotificationFactory.java
    └── 📜 NotificationBehaviors.java
```

## Code Examples

### 📜 Main.java

````
 package factoryMethod.main;

import factoryMethod.notification.Notification;
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
````

### 📜 Email.java

````
package factoryMethod.notification;

public class Email implements Notification {
    @Override
    public String notifyUser (String name, String email) {
        return name + ", send to email: " + email;
    }
}
````

### 📜 Notification.java

````
package factoryMethod.notification;

public interface Notification {
    String notifyUser (String name, String email);
}

````

### 📜 Push.java

````
package factoryMethod.notification;

public class Push implements Notification {
    @Override
    public String notifyUser (String name, String email) {
        return name + ", send to PUSH: " + email;
    }
}
````

### 📜 SMS.java

````
package factoryMethod.notification;

public class SMS implements Notification {
    @Override
    public String notifyUser (String name, String email) {
        return name + ", send to SMS: " + email;
    }
}
````

### 📜 NotificationFactory.java

````
package factoryMethod.notificationFactory;

import factoryMethod.notification.Notification;

public abstract class NotificationFactory {

    public abstract Notification creationNotificationEmail ();

    public abstract Notification creationNotificationSMS ();

    public abstract Notification creationNotificationPush ();

}

````

### 📜 NotificationFactory.java

````
package factoryMethod.notificationFactory;

import factoryMethod.notification.Notification;

public abstract class NotificationFactory {

    public abstract Notification creationNotificationEmail ();

    public abstract Notification creationNotificationSMS ();

    public abstract Notification creationNotificationPush ();

}

````

### 📜 NotificationsBehaviors.java

````
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

````

# Explanation

- Notification Interface: Defines a method notifyUser which all notification types must implement.
  - ``Email.java``, ``SMS.java``, and ``Push.java`` implement the Notification interface and provide specific implementations for the notifyUser method.


- NotificationFactory: An abstract class with methods to create different types of notifications.
  - ``NotificationFactory.java`` contains abstract methods ``creationNotificationEmail()``, ``creationNotificationSMS()``, and ``creationNotificationPush()``.

- NotificationsBehaviors: A concrete implementation of the NotificationFactory which overrides the methods to create instances of ``Email``, ``SMS``, and ``Push``.
  - ``NotificationsBehaviors.java`` provides the implementations for the factory methods, returning instances of ``Email``, ``SMS``, and ``Push``.


- Main Class: Demonstrates the usage of the factory method to create and use different types of notifications.
  - ``Main.java`` creates instances of NotificationsBehaviors and uses it to generate different notifications, storing the results in a list and printing them.
