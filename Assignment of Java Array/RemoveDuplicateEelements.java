// Que - 33 Write a Java program to remove duplicate elements from a given array and return the updated array length.

import java.util.Arrays;

class RemoveDuplicateEelements{
	public static void main(String[] args){
		int[] arr = {1, 2, 3, 3, 4, 5, 6, 6, 7};
		Arrays.sort(arr);
		
		int[] newArr= new int[arr.length];
		int j=0;
		
		for(int i=0;i<arr.length;i++){
			if(i==0 ||arr[i]!= arr[i-1]){
				newArr[j++]= arr[i];
			}
		}
		for(int i=0;i<j;i++){
			System.out.println(newArr[i]);
		}
	}
}