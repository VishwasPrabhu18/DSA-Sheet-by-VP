import java.util.Scanner;

public class Q5_PalindromString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str = in.next();

        boolean isPalindrome = true;
        int s = 0, e = str.length()-1;

        while (s < e) {
            if (str.charAt(s) == str.charAt(e)) {
                s += 1;
                e -= 1;
            } else {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is NOT a Palindrome");
        }

        in.close();
    }
}