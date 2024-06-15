package builder.Main;

import builder.Animal.Animal;
import builder.Animal.AnimalBuilder;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class MainAnimal {
    public static void main(String[] args) throws InterruptedException {
        List<Animal> animalList = new ArrayList<>();

        boolean condtion = true;

        while (condtion) {
            Animal animal = new AnimalBuilder().name("Dexter").race("Boxer").owner("Daniel").createNewAnimal();
            animalList.add(animal);

            String option = JOptionPane.showInputDialog("Would you like to continue N(not) Y(yes)");

            if (option.equalsIgnoreCase("N")) {
                condtion = false;
            }

            JOptionPane.showMessageDialog(null, "List update");
        }

        for (Animal value : animalList) {
            System.out.println(value);
        }

        Thread.sleep(1);

    }
}
