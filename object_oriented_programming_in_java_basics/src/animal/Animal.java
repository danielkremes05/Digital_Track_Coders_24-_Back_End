package animal;

public class Animal {
    private static int numberAnimals;
    public String setStateSpirit;
    private String name;
    private String race;
    private String furColor;
    private int age;
    private double height;
    private String stateSpririt;


    public Animal(String name, String race, String furColor, int age, double height) {
        this.name = name;
        this.race = race;
        this.furColor = furColor;
        this.age = age;
        this.height = height;
        numberAnimals++;
    }


    public static int getNumberAnimals() {
        return numberAnimals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void eat() {
        System.out.println("Eat");
    }

    public void sleep() {
        System.out.println("Sleep");
    }

    public void sweat() {
        System.out.println("Sweat");
    }

    int getNumberDogs() {
        return getNumberDogs();
    }

    int getNumberCats() {
        return getNumberCats();
    }

    @Override
    public String toString() {
        return "Animal{" + "age=" + age + ", name='" + name + '\'' + ", race='" + race + '\'' + ", furColor='" + furColor + '\'' + ", height=" + height + '}';
    }
}
