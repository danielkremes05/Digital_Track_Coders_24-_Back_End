package variables;

public class VariablesStudie {
    public static void main(String[] args) {
        String name = "Daniel Renato Kremes";
        int age = 24;
        double price = 1800;
        int ageCurrently = 24;
        int ageNext = 25;
        float result = (float) ageNext + ageCurrently;


        System.out.println("Hello " + name + ", age: " + age + ", price " + price);
        System.out.println();
        System.out.println("Result " + result);
    }
}
