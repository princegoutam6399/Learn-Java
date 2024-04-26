// Ques - 7 Write a Java program to remove a specific element from an array.

import java.util.Arrays;

class RemoveSpecificElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int removeElement = 3;
        int index = -1;
		
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == removeElement) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = index; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }

            
            int[] result = new int[arr.length - 1];
            System.arraycopy(arr, 0, result, 0, arr.length - 1);

            System.out.println("Original array: " + Arrays.toString(arr));
            System.out.println("Array after removing " + removeElement + ": " + Arrays.toString(result));
        } else {
            System.out.println("The element to remove is not found in the array.");
        }
    }
}
