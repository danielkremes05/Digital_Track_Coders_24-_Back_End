package animal;

public class Cat extends Animal {
    private static int numberCat;

    public Cat(String name, String race, String furColor, int age, double height) {
        super(name, race, furColor, age, height);
        numberCat++;
    }

    public int getNumberCat() {
        return numberCat;
    }

}
