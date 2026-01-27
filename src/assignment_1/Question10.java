package assignment_1;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Question10 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1); list.add(2); list.add(2); list.add(3);

        // حذف المكرر باستخدام Stream
        list = new LinkedList<>(list.stream().distinct().collect(Collectors.toList()));

        System.out.println("List after removing duplicates: " + list);
    }
}
