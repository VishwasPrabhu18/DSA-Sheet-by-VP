/**
 * Q7_Patter2
 * 
 *  n = 5
 * 
 *      1
 *      2  6
 *      3  7  10
 *      4  8  11  13
 *      5  9  12  14  15
 * 
 */
public class Q7_Pattern2 {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            int v = i;
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    System.out.print(i + "  ");
                } else {
                    v = n + v - j + 1;
                    System.out.print(v + "  ");
                }
            }
            System.out.println();
        }
    }
}