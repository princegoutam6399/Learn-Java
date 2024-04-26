// Ques - 9 Write a Java program to insert an element (specific position) into an array.

import java.util.Arrays;

public class InsertAnElement{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int element = 10;
        int position = 2; 
        
        System.out.println("Original array: " + Arrays.toString(arr));
        
        int[] result = new int[arr.length + 1];
        
        for (int i = 0; i < position; i++) {
            result[i] = arr[i];
        }
		
        result[position] = element;
        
        for (int i = position; i < arr.length; i++) {
            result[i + 1] = arr[i];
        }
        
        arr = result;
        
        System.out.println("Array after inserting " + element + " at position " + position + ": " + Arrays.toString(arr));
    }

}
