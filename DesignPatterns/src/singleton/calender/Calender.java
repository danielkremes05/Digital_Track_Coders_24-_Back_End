package singleton.calender;

import java.util.HashMap;
import java.util.Map;

public class Calender {

    Map<String, Boolean> daysAvailable = new HashMap<>();

    public Calender () {

        daysAvailable.put("Monday", Boolean.TRUE);
        daysAvailable.put("Tuesday", Boolean.TRUE);
        daysAvailable.put("Wednesday", Boolean.TRUE);
        daysAvailable.put("Thursday", Boolean.TRUE);
        daysAvailable.put("Friday", Boolean.TRUE);
        daysAvailable.put("Saturday", Boolean.TRUE);
        daysAvailable.put("Sunday", Boolean.TRUE);

    }

    public Map<String, Boolean> getDaysAvailable () {
        return daysAvailable;
    }

    public void busy (String day) {
        daysAvailable.replace(day, Boolean.FALSE);
    }
}
