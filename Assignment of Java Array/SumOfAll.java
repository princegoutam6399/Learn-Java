// Ques - 31 Write a Java program to check if the sum of all the 10's in the array is exactly 30. Return false if the condition does not satisfy, otherwise true.

class SumOfAll {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 10, 40, 10, 50};
        int sum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 10) {
                sum = sum + arr[i];
            }
        }
        
        System.out.println("Is the sum of all 10's exactly 30? " + (sum == 30));
    }
}
