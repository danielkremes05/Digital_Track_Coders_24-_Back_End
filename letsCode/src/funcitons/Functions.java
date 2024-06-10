package funcitons;

public class Functions {
    public static void main(String[] args) {
        greeting("Daniel");
        int result = sum(10,30);
        System.out.println(result);
    }

    public static void greeting(String greetingMessage) {
        System.out.println("Hello: " + greetingMessage);
    }

    public static int sum(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

}
