/**
 * Q7_Pattern1
 * 
 *      1
 *      2 9
 *      3 8 10
 *      4 7 11 14
 *      5 6 12 13 15
 * 
 */
public class Q7_Pattern1 {
    public static void main(String[] args) {
        int n = 5;

        int count = 1;

        for (int i = 0; i < n; i++) {
            int tempCount = count;

            for (int j = 0; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print(tempCount + " ");
                    tempCount += n - j + i;
                } else {
                    System.out.print(tempCount + " ");
                    tempCount += j + 1;
                }
            }

            count += i + 1;
            System.out.println();
        }
    }    
}