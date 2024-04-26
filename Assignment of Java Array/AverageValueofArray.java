// Ques - 4 4. Write a Java program to calculate the average value of array elements.

import java.util.Arrays;

class AverageValueofArray{
	public static void main(String[] args){
		int[] arr = {2, 3, 6, 1, 6};
		int sum =0;
		
		for (int num : arr) {
				sum += num;
			}
		double average = (double) sum / arr.length;
		
		System.out.println("Average value of the array elements: " + average);
	}
}