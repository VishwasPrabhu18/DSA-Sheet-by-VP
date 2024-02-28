import java.util.*;

/**
 * Isoogram -> A string does not contains any repetating letters
 */
public class Q1_Isogram {

    public static boolean isIogram(String str) {
        boolean isogram = true;
        char chrArr[] = str.toCharArray();
        
        Set<Character> chrSt = new HashSet<>();

        for (Character c : chrArr) {
            if (chrSt.contains(c)) {
                isogram = false;
            } else {
                chrSt.add(c);
            }
        }

        return isogram;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = in.next();
        if (isIogram(s)) {
            System.err.println("Isongrma");
        } else {
            System.out.println("Not Isongram");
        }

        in.close();
    }
}