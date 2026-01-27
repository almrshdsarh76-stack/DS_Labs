package assignment_1;

import java.util.LinkedList;

/**
 * Question 5: Write a function to concatenate two linked lists.
 */
public class Question5 {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("A");
        list1.add("B");

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("C");
        list2.add("D");

        // دمج القائمة الثانية في الأولى
        list1.addAll(list2);

        System.out.println("Concatenated List: " + list1);
    }
}
