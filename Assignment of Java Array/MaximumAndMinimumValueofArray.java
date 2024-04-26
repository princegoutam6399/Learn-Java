// Ques - 10 Write a Java program to find the maximum and minimum value of an array.

import java.util.Arrays;

class MaximumAndMinimumValueofArray{
	public static void main(String[] args){
		int[] arr= {34,21,45,23,90};
		int minValue =arr[0];
		int maxValue =arr[0]; 
		
		for(int i=1;i<arr.length;i++){
			if(arr[i]>maxValue){
				maxValue=arr[i];
			}
			if(arr[i]<minValue){
				minValue=arr[i];
			}
		}
		System.out.println("Maximum value in the array: " + maxValue);
        System.out.println("Minimum value in the array: " + minValue);
	}
}