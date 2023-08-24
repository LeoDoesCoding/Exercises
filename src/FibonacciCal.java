import java.math.BigInteger;

public class FibonacciCal {
    static int counter = 0;
    public static void main(String[] args) {
        System.out.println(0);
        Fibonacci(BigInteger.valueOf(0), BigInteger.valueOf(1));
    }

    //Fibonacci method, prints fibonacci sequence up to 100n
    public static void Fibonacci(BigInteger bigBoi, BigInteger bigBoi2){
        bigBoi = bigBoi.add(bigBoi2);
        System.out.println("\n" + bigBoi);
        counter += 1;
        if (counter != 100){
            Fibonacci(bigBoi2, bigBoi);
        }
    }
}
