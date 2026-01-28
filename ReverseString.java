package assignment_2;
import java.util.Stack;

public class ReverseString {
    // دالة لعكس النص باستخدام الـ Stack
    public static String reverse(String input) {
        Stack<Character> stack = new Stack<>();

        // 1. إدخال كل حروف النص في الـ Stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // 2. سحب الحروف من الـ Stack لبناء النص المعكوس
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String original = "Data Structure";
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reverse(original));
    }
}