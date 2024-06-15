package singleton.calenderSingletonEAGGER;

import java.util.HashMap;
import java.util.Map;

public class CalenderSingletonEAGGER {

    private static final CalenderSingletonEAGGER INSTANCE = new CalenderSingletonEAGGER();

    Map<String, Boolean> daysAvailable = new HashMap<>();

    private CalenderSingletonEAGGER () {

        daysAvailable.put("Monday", Boolean.TRUE);
        daysAvailable.put("Tuesday", Boolean.TRUE);
        daysAvailable.put("Wednesday", Boolean.TRUE);
        daysAvailable.put("Thursday", Boolean.TRUE);
        daysAvailable.put("Friday", Boolean.TRUE);
        daysAvailable.put("Saturday", Boolean.TRUE);
        daysAvailable.put("Sunday", Boolean.TRUE);

    }

    public static CalenderSingletonEAGGER getINSTANCE () {
        return INSTANCE;
    }

    public Map<String, Boolean> getDaysAvailable () {
        return daysAvailable;
    }

    public String busy (String day) {
        daysAvailable.replace(day, Boolean.FALSE);
        return day;
    }
}
