// Ques - 21 Write a Java program to convert an ArrayList to an array.

import java.util.Arrays;
import java.util.ArrayList;

class ConvertAnArrayListToAnArray{
	public static void main(String[] args){
		ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add("orange");
        arrayList.add("grape");
        arrayList.add("mango");
		
		String[] array= new String[arrayList.size()];
		arrayList.toArray(array);
		
		System.out.println("Array elements:");
        System.out.println(Arrays.toString(array));
	}
}