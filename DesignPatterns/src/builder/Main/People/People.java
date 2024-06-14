package builder.Main.People;


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
