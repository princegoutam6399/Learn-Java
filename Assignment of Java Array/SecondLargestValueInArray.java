// Ques-17 Write a Java program to find the second largest element in an array.

import java.util.Arrays;

class SecondLargestValueInArray{
	public static void main(String[] args){
		int[] arr ={23,65,34,21,98,67};
			for(int i=0;i<arr.length;i++){
				for(int j=0;j<arr.length-1;j++){
					if(arr[j]<arr[j+1]){
						int temp = arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
			System.out.println("Second Largest Number Is :"+arr[1]);
	}
}