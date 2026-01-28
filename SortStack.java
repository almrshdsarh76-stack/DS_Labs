package assignment_2;
import java.util.Stack;

public class SortStack {
    public static Stack<Integer> sort(Stack<Integer> input) {
        Stack<Integer> tmpStack = new Stack<>();

        while (!input.isEmpty()) {
            // سحب العنصر الحالي
            int current = input.pop();

            // إذا كان العنصر الحالي أصغر من الموجود في الـ Stack المؤقت، نعيد العناصر للـ Stack الأصلي
            while (!tmpStack.isEmpty() && tmpStack.peek() > current) {
                input.push(tmpStack.pop());
            }

            // وضع العنصر في مكانه الصحيح
            tmpStack.push(current);
        }
        return tmpStack;
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(34); s.push(3); s.push(31); s.push(98); s.push(92); s.push(23);

        System.out.println("Sorted Stack: " + sort(s));
    }
}
