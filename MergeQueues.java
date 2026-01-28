package assignment_2;
import java.util.LinkedList;
import java.util.Queue;

public class MergeQueues {
    public static Queue<Integer> merge(Queue<Integer> q1, Queue<Integer> q2) {
        Queue<Integer> merged = new LinkedList<>();
        while (!q1.isEmpty() && !q2.isEmpty()) {
            if (q1.peek() <= q2.peek()) {
                merged.add(q1.remove());
            } else {
                merged.add(q2.remove());
            }
        }
        while (!q1.isEmpty()) merged.add(q1.remove());
        while (!q2.isEmpty()) merged.add(q2.remove());
        return merged;
    }

    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1); q1.add(3); q1.add(5);
        Queue<Integer> q2 = new LinkedList<>();
        q2.add(2); q2.add(4); q2.add(6);
        System.out.println("Merged Queue: " + merge(q1, q2));
    }
}