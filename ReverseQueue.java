package assignment_2;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        // نقل العناصر من الطابور للمدخنة
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
        // إرجاع العناصر للطابور (سترجع معكوسة)
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10); q.add(20); q.add(30);
        System.out.println("Original Queue: " + q);
        reverse(q);
        System.out.println("Reversed Queue: " + q);
    }
}