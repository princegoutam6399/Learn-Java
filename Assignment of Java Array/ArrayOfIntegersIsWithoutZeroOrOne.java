// Ques - 30 Write a Java program to check if an array of integers is without 0 and -1

import java.util.Arrays;

class ArrayOfIntegersIsWithoutZeroOrOne{
	public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {0, 2, 3, -1, 5};

        for (int num : arr1) {
            if (num == 0 || num == -1) {
                return false;
            }
        }

        System.out.println("Is arr1 without 0 and -1? " + (isWithoutZeroOrOne(arr1) ? "Yes" : "No"));
        System.out.println("Is arr2 without 0 and -1? " + (isWithoutZeroOrOne(arr2) ? "Yes" : "No"));
    }
}