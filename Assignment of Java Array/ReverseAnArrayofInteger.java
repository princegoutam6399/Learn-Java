// Ques - 11 Write a Java program to reverse an array of integer values

import java.util.Arrays;

class ReverseAnArrayofInteger{
	public static void main(String[] args){
		int[] arr = {1, 2, 3, 4, 5};
		for(int i=arr.length-1;i>=0;i--){
			System.out.println("Reverse Array :"+arr[i]);
		}
		
	}
}