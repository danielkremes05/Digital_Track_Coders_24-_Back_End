package arrays;

public class Arrays {
    public static void main(String[] args) {
//        int[] numbers = new int[5];
//
//        numbers[0] = 20;
//        numbers[1] = 19;
//        numbers[2] = 18;
//        numbers[3] = 17;
//        numbers[4] = 16;
//
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }

//        String[] names = {"A" ,"B", "C", "D", "E"};
//
//        System.out.println(java.util.Arrays.toString(names));

        int[] numbers = {20, 30, 40, 60, 70, 7, 9, 10};

        int largerNumber = numbers[0];
        int smallNumber = numbers[0];
        int average = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > largerNumber) {
                largerNumber = numbers[i];
            }

            if (numbers[i] < smallNumber) {
                smallNumber = numbers[i];
            }

            average += numbers[i];

        }

        average = average / numbers.length;

        System.out.println("Larger: " + largerNumber);
        System.out.println("Small: " + smallNumber);
        System.out.println("Average: " + average);
    }
}
