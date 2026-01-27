package assignment_1;
import java.util.LinkedList;

public class Question9 {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Ali"); names.add("Sara"); names.add("Ahmed");

        names.remove("Sara"); // حذف عنصر محدد

        System.out.println("List after removal: " + names);
    }
}
