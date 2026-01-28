package assignment_1;
import java.util.LinkedList;
import java.util.Collections;

public class Question11 {
    public static void main(String[] args) {
        LinkedList<Integer> dll = new LinkedList<>();
        dll.add(1); dll.add(2); dll.add(3);

        System.out.println("Original: " + dll);
        Collections.reverse(dll); // عكس القائمة للطباعة
        System.out.println("Reversed: " + dll);
    }
}