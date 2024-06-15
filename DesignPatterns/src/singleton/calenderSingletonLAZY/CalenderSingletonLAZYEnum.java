package singleton.calenderSingletonLAZY;

import java.util.HashMap;
import java.util.Map;

public enum CalenderSingletonLAZYEnum {

    INSTANCE;

    Map<String, Boolean> daysAvailable = new HashMap<>();

    private CalenderSingletonLAZYEnum () {

        daysAvailable.put("Monday", Boolean.TRUE);
        daysAvailable.put("Tuesday", Boolean.TRUE);
        daysAvailable.put("Wednesday", Boolean.TRUE);
        daysAvailable.put("Thursday", Boolean.TRUE);
        daysAvailable.put("Friday", Boolean.TRUE);
        daysAvailable.put("Saturday", Boolean.TRUE);
        daysAvailable.put("Sunday", Boolean.TRUE);

    }

    public static CalenderSingletonLAZYEnum getINSTANCE () {
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
