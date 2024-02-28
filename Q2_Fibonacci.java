import java.util.Scanner;

public class Q2_Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = in.nextInt();

        System.out.printf("Fibonacci Number at %d position is : %d", n, Fibonacci(n));

        in.close();
    }
    
    public static int Fibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}
