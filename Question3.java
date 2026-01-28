package assignment_1;

import java.util.Arrays;

/**
 * Question 3: Write a program in Java to remove a specific element from an array.
 */
public class Question3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int elementToRemove = 3; // العنصر المراد حذفه

        // إنشاء مصفوفة جديدة بحجم أقل بواحد
        int[] newArray = new int[array.length - 1];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != elementToRemove) {
                newArray[j++] = array[i];
            }
        }

        System.out.println("Array after removing " + elementToRemove + ": " + Arrays.toString(newArray));
    }
}
