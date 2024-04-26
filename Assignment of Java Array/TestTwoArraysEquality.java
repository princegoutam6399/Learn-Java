// Ques - 23 Write a Java program to test two arrays' equality

import java.util.Arrays;

class TestTwoArraysEquality{
	public static void main(String[] args){
		int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
		
		System.out.println("My arr is :"+Arrays.toString(arr1));
		System.out.println("My arr is :"+Arrays.toString(arr2));
		
		if(Arrays.equals(arr1,arr2)){
			System.out.println("Arrays Are Equal");
		}else{
			System.out.println("Arrays Are Not Equal");
		}
	}
}