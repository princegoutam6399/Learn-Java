// Ques - 27 Write a Java program to find the number of even and odd integers in a given array of integers.

import java.util.Arrays;

class EvenAndOddIntegers{
	public static void main(String[] args){
		int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10};
		int even=0;
		int odd=0;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				even++;
			}else{
				odd++;
			}
		}
		System.out.println("Number of even integers: " + even);
        System.out.println("Number of odd integers: " + odd);
	}
}