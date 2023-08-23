package Extras;

import java.util.Random;

public class Duplicates {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers1 = new int[10];
        int[] numbers2 = new int[10];

        //Populate each array (random values 1-20) and print numbers1
        System.out.println("Number array 1: ");
        for (int i = 0; i < numbers1.length; i++){
            numbers1[i] = rand.nextInt(20) + 1;
            numbers2[i] = rand.nextInt(20) + 1;
            System.out.print(numbers1[i] + ", ");
        }

        //print numbers2
        System.out.println("\nNumber array 2: ");

        for (int number: numbers2){
            System.out.print(number + ", ");
        }
        System.out.println("\n");

        //Search for duplicate values
        for (int number1 : numbers1){
            for (int number2 : numbers2){
                if (number1 == number2){
                    System.out.println("Duplicates found in each list: " + number1);
                }
            }
        }




    }
}
