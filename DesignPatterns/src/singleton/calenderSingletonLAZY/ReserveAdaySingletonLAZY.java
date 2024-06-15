package singleton.calenderSingletonLAZY;

public class ReserveAdaySingletonLAZY {
    CalenderSingletonLAZY singletonEAGGER = CalenderSingletonLAZY.getINSTANCE();

    public CalenderSingletonLAZY getSingletonEAGGER () {
        return singletonEAGGER;
    }

    public void remove (String day) {
        singletonEAGGER.busy(day);
    }


}
