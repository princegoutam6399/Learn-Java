// Ques - 26 Write a Java program to move all 0's to the end of an array. Maintain the relative order of the other (non-zero) array elements.

import java.util.Arrays;

class NonZeroArrayElements {
    public static void moveZeros(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }
        while (index < arr.length) {
            arr[index++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 2, 4, 3, 0, 5, 0, 8, 0, 9};
        System.out.println("Original array: " + Arrays.toString(arr));
        
        moveZeros(arr);
        
        System.out.println("Array after moving zeros to end: " + Arrays.toString(arr));
    }
}
