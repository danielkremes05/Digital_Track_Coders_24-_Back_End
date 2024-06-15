# Studies About Design Patterns in Java

## Folders Design Patterns

### Structure Folder 

```plaintext
📁 builder
├── 📁 Animal
│   ├── 📜 Animal.java
│   └── 📜 AnimalBuilder.java
├── 📁 Main
│   ├── 📜 MainAnimal.java
│   └── 📜 MainPeople.java
└── 📁 People
    ├── 📜 People.java
    └── 📜 PeopleBuilder.java
```

## Code Examples
### 📜 Animal.java

````
package builder.Animal;

public class Animal {
    private String name;
    private String race;
    private String owner;

    public Animal (String name, String owner, String race) {
        this.name = name;
        this.owner = owner;
        this.race = race;
    }

    public String getRace() {
        return race;
    }

    public String getOwner() {
        return owner;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal " + "name='" + name + '\'' + ", race='" + race + '\'' + ", owner='" + owner + '\'';
    }
}


````

### 📜 AnimalBuilder.java
````
package builder.Animal;

public class AnimalBuilder {

    private String name;
    private String race;
    private String owner;

    public AnimalBuilder name(String name) {
        this.name = name;
        return this;
    }

    public AnimalBuilder owner(String owner) {
        this.owner = owner;
        return this;
    }

    public AnimalBuilder race(String race) {
        this.race = race;
        return this;
    }

    public Animal createNewAnimal() {
        return new Animal(name, owner, race);
    }
}

````

### 📜 MainAnimal.java
````
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

````

### 📜 MainPeople.java

````
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

````


### 📜 People.java

````
package builder.People;


import java.time.LocalDate;

public class People {

    String name;
    int age;
    String cpf;
    String rg;
    LocalDate dateborn;
    String father;
    String mother;

    public People(int age, String cpf, LocalDate dateborn, String father, String mother, String name, String rg) {
        this.age = age;
        this.cpf = cpf;
        this.dateborn = dateborn;
        this.father = father;
        this.mother = mother;
        this.name = name;
        this.rg = rg;
    }

    public int age() {
        return age;
    }

    public String cpf() {
        return cpf;
    }

    public LocalDate dateborn() {
        return dateborn;
    }

    public String father() {
        return father;
    }

    public String name() {
        return name;
    }

    public String mother() {
        return mother;
    }

    public String rg() {
        return rg;
    }

    @Override
    public String toString() {
        return "People" +
                " age=" + age +
                ", name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", dateborn=" + dateborn +
                ", father='" + father + '\'' +
                ", mother='" + mother + '\'';
    }
}

````

### 📜 PeopleBuilder.java
````
package builder.People;

import java.time.LocalDate;

public class PeopleBuilder {

    String name;
    int age;
    String cpf;
    String rg;
    LocalDate dateborn;
    String father;
    String mother;

    public PeopleBuilder cpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public PeopleBuilder age(int age) {
        this.age = age;
        return this;
    }

    public PeopleBuilder dateborn(LocalDate dateborn) {
        this.dateborn = dateborn;
        return this;
    }

    public PeopleBuilder father(String father) {
        this.father = father;
        return this;
    }

    public PeopleBuilder name(String name) {
        this.name = name;
        return this;
    }

    public PeopleBuilder mother(String mother) {
        this.mother = mother;
        return this;
    }

    public PeopleBuilder rg(String rg) {
        this.rg = rg;
        return this;
    }

    public People newPeople() {
        return new People(24, "12489986909",
                LocalDate.of(2024, 6, 14), "Pedro", "Olira", "Daniel", "146502412");
    }


}
````

