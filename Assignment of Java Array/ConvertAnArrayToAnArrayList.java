// Ques - 20 Write a Java program to convert an array to an ArrayList.

import java.util.Arrays;
import java.util.ArrayList;

class ConvertAnArrayToAnArrayList{
	public static void main(String[] args){
		String[] array = {"apple", "banana", "orange", "grape", "mango"};

			ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));
			
			System.out.println("ArrayList elements:");
				for (String element : arrayList) {
            System.out.println(element);
        }
	}
}
