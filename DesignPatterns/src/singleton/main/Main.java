package singleton.main;

import singleton.calender.Calender;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args) {
        List<String> daysBusy = new ArrayList<>();
        Calender daysFree = new Calender();
        System.out.println("Days free usually: ");
        System.out.println(daysFree.getDaysAvailable());
        System.out.println();

        String dayBusy = daysFree.busy("Sunday");
        daysBusy.add(dayBusy);

        System.out.println();
        System.out.println("Days busy: " + dayBusy);
        System.out.println(daysFree.getDaysAvailable());


    }
}
