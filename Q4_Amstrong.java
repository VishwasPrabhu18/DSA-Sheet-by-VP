import java.util.Scanner;

public class Q4_Amstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = in.nextInt();

        if (Amstrong(n)) {
            System.out.println(n + " is an Amstrong Number");
        } else {
            System.out.println(n + " is NOT an Amstrong Number");
        }

        in.close();
    }
    
    public static boolean Amstrong(int n) {
        int res = 0, a=n;

        while (n > 0) {
            int rem = n % 10;
            rem = rem * rem * rem;
            res += rem;
            n = n / 10;
        }

        return a == res;
    }
}
