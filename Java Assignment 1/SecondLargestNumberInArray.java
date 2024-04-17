// ques - 11  How do you find the second largest number in an array in Java? 

class SecondLargestNumberInArray {
    public static void main(String[] args) {
        int[] arr = {34, 24, 56, 37, 76};
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Second Largest Number: " + arr[1]);
        
    }
}
