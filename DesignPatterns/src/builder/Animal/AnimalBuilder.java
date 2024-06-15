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
