package singleton.main;

import singleton.calenderSingletonLAZY.CalenderSingletonLAZY;
import singleton.calenderSingletonLAZY.ReserveAdaySingletonLAZY;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MainSingletonLAZY {
    public static void main (String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        CalenderSingletonLAZY calenderSingletonLAZY = CalenderSingletonLAZY.getINSTANCE();

        ReserveAdaySingletonLAZY reserveAdaySingletonLAZY = new ReserveAdaySingletonLAZY();

        reserveAdaySingletonLAZY.remove("Monday");

        System.out.println(calenderSingletonLAZY.getDaysAvailable());

        reserveAdaySingletonLAZY.remove("Tuesday");
        System.out.println(calenderSingletonLAZY.getDaysAvailable());

        Constructor<CalenderSingletonLAZY> constructor = CalenderSingletonLAZY.class.getDeclaredConstructor();
        constructor.setAccessible(true);

        //Reflection
        CalenderSingletonLAZY calenderSingletonLAZY1 = constructor.newInstance();
        CalenderSingletonLAZY calenderSingletonLAZY2 = constructor.newInstance();

        System.out.println(calenderSingletonLAZY1);
        System.out.println(calenderSingletonLAZY2);


    }
}
