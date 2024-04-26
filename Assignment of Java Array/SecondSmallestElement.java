// Ques - 18 18. Write a Java program to find the second smallest element in an array.

import java.util.Arrays;

class SecondSmallestElement{
	public static void main(String[] args){
		int[] arr={34,56,21,89,42};
			for(int i=0;i<arr.length;i++){
				for(int j=0;j<arr.length-1;j++){
					if(arr[j]>arr[j+1]){
						int temp = arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
			System.out.println("Second Smallest Number Is :"+arr[1]);
	}
}
