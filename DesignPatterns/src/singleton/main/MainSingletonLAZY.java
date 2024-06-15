package singleton.main;

import singleton.calenderSingletonLAZY.CalenderSingletonLAZY;
import singleton.calenderSingletonLAZY.ReserveAdaySingletonLAZY;

public class MainSingletonLAZY {
    public static void main (String[] args) {

        CalenderSingletonLAZY calenderSingletonLAZY = CalenderSingletonLAZY.getINSTANCE();

        ReserveAdaySingletonLAZY reserveAdaySingletonLAZY = new ReserveAdaySingletonLAZY();

        reserveAdaySingletonLAZY.remove("Monday");

        System.out.println(calenderSingletonLAZY.getDaysAvailable());

        reserveAdaySingletonLAZY.remove("Tuesday");
        System.out.println(calenderSingletonLAZY.getDaysAvailable());

    }
}
