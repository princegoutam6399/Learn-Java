// Ques - 14 Write a Java program to find common elements between two arrays (string values).

import java.util.Arrays;

class CommonElementsBetweenTwoArrays {
    public static void main(String[] args) {
        String[] arr1 = {"apple", "banana", "orange", "grape", "mango"};
        String[] arr2 = {"banana", "grape", "watermelon", "apple", "kiwi"};

        System.out.println("Common elements between the arrays:");
        for (String element1 : arr1) {
            for (String element2 : arr2) {
                if (element1.equals(element2)) {
                    System.out.println(element1);
                    break;
                }
            }
        }
    }
}
