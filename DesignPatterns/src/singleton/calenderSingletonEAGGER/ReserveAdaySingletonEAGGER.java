package singleton.calenderSingletonEAGGER;

public class ReserveAdaySingletonEAGGER {
    CalenderSingletonEAGGER singletonEAGGER = CalenderSingletonEAGGER.getINSTANCE();

    public CalenderSingletonEAGGER getSingletonEAGGER () {
        return singletonEAGGER;
    }

    public void remove (String day) {
        singletonEAGGER.busy(day);
    }
}
