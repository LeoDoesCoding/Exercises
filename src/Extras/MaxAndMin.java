package Extras;
import java.util.Random;

public class MaxAndMin {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];

        //Populate array (random values 1-10)
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = rand.nextInt(10) + 1;
        }
        //Breakpoint here to view array values

        //Base values to compare from
        int min = numbers[0];
        int max = numbers[0];

        //Iterate array and find min and max values
        for (int number : numbers){
            if (min > number) {
                min = number;
            }
            if (max < number) {
                max = number;
            }
        }

        System.out.println("Min value is " + min);
        System.out.println("Max value is " + max);
    }
}
