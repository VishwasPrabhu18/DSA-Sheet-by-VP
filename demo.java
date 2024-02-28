import java.util.ArrayList;

public class demo {
    public static void main(String[] args) {
        String a = "abcfgsdsatgasfdsdffdhdtdaasdfsdfsdf";
        String arr[] = null;

        arr = a.split("atg.*taa");

        System.out.println(arr[0]);
    }
}
