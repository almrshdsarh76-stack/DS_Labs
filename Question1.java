package assignment_1;

import java.util.Arrays;

/**
 * Question 1: Write a program to clone an array.
 */
public class Question1 {
    public static void main(String[] args) {
        // المصفوفة الأصلية
        int[] originalArray = {10, 20, 30, 40, 50};

        // استنساخ المصفوفة باستخدام دالة clone()
        int[] clonedArray = originalArray.clone();

        // طباعة النتائج للتأكد
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Cloned Array:   " + Arrays.toString(clonedArray));
    }
}
