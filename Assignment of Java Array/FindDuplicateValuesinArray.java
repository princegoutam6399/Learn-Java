// ques -12 Write a Java program to find duplicate values in an array of integer values

import java.util.Arrays;

class FindDuplicateValuesinArray{
	public static void main(String[] args){
		int[] arr = {1,2,2,3,1,3,4,5,6,5};
		for(int i=0;i<arr.length;i++){
			int count = 0;
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					count++;
					arr[j]=-1;
				}
			}
			if((count>0)&&(arr[i]!=-1)){
			System.out.println("Duplicate values :"+arr[i]);
		   }
		}
	}
}