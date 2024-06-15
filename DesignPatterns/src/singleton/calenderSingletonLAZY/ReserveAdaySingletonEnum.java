package singleton.calenderSingletonLAZY;

public class ReserveAdaySingletonEnum {
    CalenderSingletonLAZY singletonLAZY = CalenderSingletonLAZY.getINSTANCE();

    public CalenderSingletonLAZY getSingletonEAGGER () {
        return singletonLAZY;
    }

    public void remove (String day) {
        singletonLAZY.busy(day);
    }


}
