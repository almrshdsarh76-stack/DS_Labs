package assignment_1;
import java.util.Random;
import java.util.Arrays;

public class Question2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int randomIndex = new Random().nextInt(arr.length);
        System.out.println("Removing element at index: " + randomIndex);

        int[] newArr = new int[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == randomIndex) continue;
            newArr[k++] = arr[i];
        }
        System.out.println("New Array: " + Arrays.toString(newArr));
    }
}