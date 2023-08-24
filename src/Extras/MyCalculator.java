package Extras;
import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        float num1;
        float num2;
        System.out.println("Enter a number: ");
        num1 = myScanner.nextFloat();
        System.out.println("Enter another number: ");
        num2 = myScanner.nextFloat();
        Addition(num1, num2);
        Subtraction(num1, num2);
        Division(num1, num2);
        Multiplication(num1, num2);
    }

    //Adds recieved numbers
    public static void Addition(float num1, float num2){
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }

    //Subtracts recieved numbers
    public static void Subtraction(float num1, float num2){
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }

    //Divides recieved numbers
    public static void Division(float num1, float num2){
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
    }

    //multiplies recieved numbers
    public static void Multiplication(float num1, float num2){
        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
    }
}