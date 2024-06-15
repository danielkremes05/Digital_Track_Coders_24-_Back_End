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
