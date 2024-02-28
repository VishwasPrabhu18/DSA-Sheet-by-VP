import java.util.Scanner;

class LinkedList {
    int info;
    LinkedList next = null;
    LinkedList start = null, end = null;

    public LinkedList() {
    }

    public LinkedList(int info) {
        this.info = info;
        this.next = null;
    }

    public LinkedList insertData(int n) {
        LinkedList temp = new LinkedList(n);
        if (start == null) {
            start = temp;
        } else {
            temp.next = start;
            start = temp;
        }
        
        return temp;
    }

}

public class Q6_LinkedListCreate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = in.nextInt();
        LinkedList root = new LinkedList();
        System.out.println("Enter " + n + " numbers : ");
        for (int i = 0; i < n; i++) {
            int v = in.nextInt();
            root.next = root.insertData(v);
        }
        
        LinkedList l = root;
        while (l != null) {
            System.out.println(l.info);
            l = l.next;
        }
        in.close();
    }
}
