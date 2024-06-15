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