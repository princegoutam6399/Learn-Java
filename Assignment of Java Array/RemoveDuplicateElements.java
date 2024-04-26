// Ques - 16 Write a Java program to remove duplicate elements from an array.

import java.util.Arrays;

class RemoveDuplicateElements{
	public static void main(String[] args){
		int[] arr = {1,2,3,3,5,3,5,6,7,8,7};
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if((arr[i]==arr[j]) && (arr[i]!=-1)){
					arr[j]=-1;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=-1){
				System.out.println(arr[i]);
			}
		}
	}
}