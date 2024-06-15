package singleton.main;

import singleton.calenderSingletonLAZY.CalenderSingletonLAZY;
import singleton.calenderSingletonLAZY.CalenderSingletonLAZYEnum;
import singleton.calenderSingletonLAZY.ReserveAdaySingletonEnum;
import singleton.calenderSingletonLAZY.ReserveAdaySingletonLAZY;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MainSingletonLAZYEnum {
    public static void main (String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        CalenderSingletonLAZYEnum calenderSingletonLAZYEnum = CalenderSingletonLAZYEnum.INSTANCE.getINSTANCE();

        ReserveAdaySingletonEnum reserveAdaySingletonLAZYEnum = new ReserveAdaySingletonEnum();

        reserveAdaySingletonLAZYEnum.remove("Monday");

        System.out.println(calenderSingletonLAZYEnum.getDaysAvailable());

        reserveAdaySingletonLAZYEnum.remove("Tuesday");
        System.out.println(calenderSingletonLAZYEnum.getDaysAvailable());

        Constructor<CalenderSingletonLAZYEnum> constructor = CalenderSingletonLAZYEnum.class.getDeclaredConstructor();
        constructor.setAccessible(true);

        //Reflection
        CalenderSingletonLAZYEnum calenderSingletonLAZYEnum1 = constructor.newInstance();
        CalenderSingletonLAZYEnum calenderSingletonLAZYEnum2 = constructor.newInstance();

        System.out.println(calenderSingletonLAZYEnum1);
        System.out.println(calenderSingletonLAZYEnum2);


    }
}
