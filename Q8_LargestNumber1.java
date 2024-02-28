import java.util.List;

/**
 * Q8_LargestNumber1
 */
public class Q8_LargestNumber1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        
        // method 4
        int maxVal = list.stream().reduce(Integer.MIN_VALUE, (x, y) -> x > y ? x : y);
        System.out.println("Largest number in the list is: " + maxVal);
    }
}