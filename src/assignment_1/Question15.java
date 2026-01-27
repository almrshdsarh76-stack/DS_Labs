package assignment_1;
import java.util.LinkedList;

public class Question15 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(100); list.add(200); list.add(300);

        int searchFor = 200;
        if (list.contains(searchFor)) {
            System.out.println("Element " + searchFor + " exists in the Circular List.");
        } else {
            System.out.println("Element not found.");
        }
    }
}
