package singleton.main;

import singleton.calenderSingletonEAGGER.CalenderSingletonEAGGER;
import singleton.calenderSingletonEAGGER.ReserveAdaySingletonEAGGER;

public class MainSingletonEAGGER {
    public static void main (String[] args) {

        CalenderSingletonEAGGER calenderSingletonEAGGER = CalenderSingletonEAGGER.getINSTANCE();

        ReserveAdaySingletonEAGGER reserveAdaySingletonEAGGER = new ReserveAdaySingletonEAGGER();

        reserveAdaySingletonEAGGER.remove("Monday");

        System.out.println(calenderSingletonEAGGER.getDaysAvailable());

        reserveAdaySingletonEAGGER.remove("Tuesday");
        System.out.println(calenderSingletonEAGGER.getDaysAvailable());

    }
}
