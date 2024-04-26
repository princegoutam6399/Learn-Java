// Ques - 2 Write a Java program to sum values of an array

import java.util.Arrays;

class SumValuesofArray{
	public static void main(String[] args){
		int[] arr = {2,3,6,1,6};
		int sum =0;
		
		System.out.println("Original Array: " + Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++){
		    sum = sum+arr[i];
		}
		System.out.println(sum);
	}
}