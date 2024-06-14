import animal.Animal;
import animal.Cat;
import animal.Dog;
import store.PetShopping;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World");

        Cat cat = new Cat("Dexter", "persa", "White", 5, 60);
        Animal catAnimal = new Cat("Dexter", "persa", "White", 5, 60);
        Dog dog = new Dog("Bob", "boxer", "Brown", 7, 1.10);

        System.out.println(dog);
        System.out.println(cat);

        PetShopping petShopping = new PetShopping();
        System.out.println(petShopping.shearDog(dog));
        System.out.println(petShopping.takeBath(cat));

    }
}
