public class Q9_ReverseString1 {
    public static void main(String[] args) {
        String val = "hello";
        
        // method 1
        StringBuilder sb = new StringBuilder(val);
        System.out.println("Reverse of " + val + " is: " + sb.reverse().toString());

    }
}
