// Ques - 42 Write a Java program to separate 0s and 1s in an array of 0s and 1s into left and right sides

import java.util.Arrays;

class LeftAndRightSides{
	public static void main(String[] args){
		int[] arr = {0, 1, 0, 1, 1, 0, 1, 0};
		int left =0;
		int right=arr.length-1;
		
		while(left <right){
			while(left < right && arr[left]==0){
				left++;
			}
			while(left < right && arr[right]==1){
				right--;
			}
			
			if(left <right){
				int temp = arr[left];
				arr[left]= arr[right];
				arr[right]=temp;
				left++;
				right--;
			}
		}
		System.out.println("Separated array: " + Arrays.toString(arr));
	}
}