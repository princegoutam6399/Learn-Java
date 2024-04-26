// Ques -24 Write a Java program to find a missing number in an array.

import java.util.Arrays;

class MissingNumberAnArray{
	public static void main(String[] args){
		int[] arr = {1, 2, 4, 5, 6};
		int n = arr.length+1;
		int totalSum = n*(n+1)/2;
		int actualSum = 0;
		
		for(int num : arr ){
			actualSum=actualSum+num;
		}
		int missingNumber = totalSum-actualSum;
		System.out.println("Missing Number Is :"+missingNumber);
	}
}