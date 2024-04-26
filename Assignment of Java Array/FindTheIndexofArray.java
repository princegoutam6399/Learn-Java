// Ques - 6 Write a Java program to find the index of an array element.

import java.util.Arrays;

class FindTheIndexofArray{
	public static void main(String[] args){
		int[] arr={23,45,21,53,87};
		int targetValue = 21;
		int index = -1;
			for(int i=0;i<arr.length;i++){
				if(arr[i]==targetValue){
					index =i;
					break;
				}
			}
			if (index != -1) {
            System.out.println("Index of" + targetValue + " in the array is: " + index);
			} else {
            System.out.println(targetValue + " is not present in the array.");
        }
	}
}