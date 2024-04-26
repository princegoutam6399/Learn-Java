// Ques - 8 Write a Java program to copy an array by iterating the array.

import java.util.Arrays;

class CopyAnArrayByIteratingArray {
    public static int[] copyArray(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {34, 23, 54, 87};
        int[] newArr = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Copied array: " + Arrays.toString(newArr));
    }
}
