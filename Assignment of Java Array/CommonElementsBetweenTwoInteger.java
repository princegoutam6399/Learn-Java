// Ques - 15 Write a Java program to find common elements between two integer arrays.

import java.util.Arrays;

class CommonElementsBetweenTwoInteger{
	public static void main(String[] args){
		int[] arr1 ={2,3,4,5,6};
		int[] arr2 = {3,4,8,9,2};

			for(int elements1 :arr1){
				for(int elements2 :arr2){
					if(elements1==elements2){
						System.out.println(elements1);
						break;
					}
				}
			}
	}
}