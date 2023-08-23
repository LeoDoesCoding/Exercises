package Extras;

public class TestArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        //Calculate sum of numbers
        for (int number : numbers){
            sum += number;
        }
        System.out.println("The sum of these numbers are: " + sum);

        //Get average
        double average = (float)sum / numbers.length;
        System.out.println("The average is " + average);
    }
}
