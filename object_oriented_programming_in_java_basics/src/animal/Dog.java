package animal;

public class Dog extends Animal {
    private static int numberDogs;

    public Dog(String name, String race, String furColor, int age, double height) {
        super(name, race, furColor, age, height);
        numberDogs++;
    }

    public int getNumberDogs() {
        return numberDogs;
    }
}
