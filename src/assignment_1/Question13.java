package assignment_1;
import java.util.LinkedList;

public class Question13 {
    public static void main(String[] args) {
        LinkedList<String> circularList = new LinkedList<>();
        circularList.add("Node 1");
        circularList.add("Node 2");

        // إضافة عقدة في الموقع رقم 1 (بين العقدة 1 و 2)
        circularList.add(1, "New Specific Node");

        System.out.println("Circular List after insertion: " + circularList);
    }
}