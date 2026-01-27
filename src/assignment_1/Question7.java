package assignment_1;
import java.util.LinkedList;

public class Question7 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10); list.add(20); list.add(30);

        int target = 20;
        int position = list.indexOf(target); // البحث عن الموقع

        if (position != -1) {
            System.out.println("Element " + target + " found at position: " + position);
        } else {
            System.out.println("Element not found.");
        }
    }
}
