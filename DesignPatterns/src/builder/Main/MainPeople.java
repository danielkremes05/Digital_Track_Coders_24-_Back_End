package builder.Main;

import builder.People.People;
import builder.People.PeopleBuilder;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MainPeople {

    public static void main(String[] args) {

        List<People> peopleList = new ArrayList<>();

        boolean condition = true;

        while (condition) {
            // Create an instance of PeopleBuilder
            People people = new PeopleBuilder().age(24).cpf("12489978909").dateborn(LocalDate.of(2024, 6, 14)).father("Pedro").mother("Oliria").name("Daniel").rg("14650555").newPeople();
            peopleList.add(people);

            System.out.println();

            String option = JOptionPane.showInputDialog("Would you like to continue: Y:(yes) N:(not)");

            if (option.equalsIgnoreCase("N")) {
                condition = false;
            }

        }

        for (People value : peopleList) {
            System.err.println(value);
        }

    }
}
