package other_programmes;

import java.util.Arrays;

/**
 * Write a Java program to reverse an array of integer values.
 */
public class Programme_3_ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(arr));

        //Reverse the Array
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}
