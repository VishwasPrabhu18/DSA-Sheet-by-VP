import java.util.Scanner;

public class Q3_Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n = in.nextInt();

        System.out.println("Factorial of " + n + " is : " + Factorial(n));

        in.close();
    }
    
    public static int Factorial(int n) {
        if(n <= 1)
            return 1;
        else
            return n * Factorial(n - 1);
    }
}
