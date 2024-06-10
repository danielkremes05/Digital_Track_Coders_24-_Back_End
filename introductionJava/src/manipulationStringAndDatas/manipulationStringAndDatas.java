package manipulationStringAndDatas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Locale;

public class manipulationStringAndDatas {
    public static void main(String[] args) {

        String name = "Daniel";
        LocalDate dateToday = LocalDate.now();
        System.out.println(dateToday.getDayOfWeek());
        System.out.println(dateToday.getDayOfYear());
        System.out.println(dateToday.getMonth());

        Locale brazilian = new Locale("pt", "BR");
        System.out.println();

        String dayWeek = dateToday.getDayOfWeek().getDisplayName(TextStyle.FULL, brazilian).toUpperCase();
        System.out.println(dayWeek);

        LocalDateTime  localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.getHour() + " " + localDateTime.getMinute());

        if (localDateTime.getHour() > 0 && localDateTime.getHour() < 12) {
            System.out.printf("Name %s, Today is %s Good Morning ", name, dayWeek.toLowerCase());
        } else if (localDateTime.getHour() > 12 && localDateTime.getHour() < 18) {
            System.out.printf("Name %s, Today is %s Good Afternoon ", name, dayWeek.toLowerCase());
        } else if (localDateTime.getHour() > 18 && localDateTime.getHour() < 24) {
            System.out.printf("Name %s, Today is %s Good Evening ", name, dayWeek.toLowerCase());
        }

    }
}
