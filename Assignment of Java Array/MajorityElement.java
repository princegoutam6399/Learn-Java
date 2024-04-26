// Ques - 38 38. Write a Java program to get the majority element from an array of integers containing duplicates. 

class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int candidate = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                candidate = arr[i];
                count = 1;
            }
        }

        count = 0;
        for (int num : arr) {
            if (num == candidate) { 
                count++;
            }
        }

        if (count > arr.length / 2) {
            System.out.println("The majority element is: " + candidate);
        } else {
            System.out.println("No majority element found.");
        }
    }
}
