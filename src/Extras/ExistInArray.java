package Extras;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExistInArray {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int input;

        System.out.println("Enter a number: ");
        while (true) {
            try {
                input = myScanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.print("Invalid input. Please enter a number: ");
                myScanner.nextLine();
            }
        }

        //Search array for entered value
        boolean found = false;
        for (int number : numbers){
            if (number == input){
                System.out.println("Value " + input + " was found in array.");
                found = true;
                break;
            }
        }

        //Value not found
        if (!found){
            System.out.println("Value was not found in array.");
        }
    }
}
