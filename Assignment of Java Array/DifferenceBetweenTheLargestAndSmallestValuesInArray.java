// Ques - 28 Write a Java program to get the difference between the largest and smallest values in an array of integers. The array must have a length of at least 1.

class DifferenceBetweenTheLargestAndSmallestValuesInArray {
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 2};

        if (arr.length < 1) {
            System.out.println("Array must have a length of at least 1");
            return; 
        }

        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        int difference = max - min;
        System.out.println("Difference between the largest and smallest values: " + difference);
    }
}
