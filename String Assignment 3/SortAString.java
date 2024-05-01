// Ques - 17 Java String Program to Sort a String

import java.util.Arrays;

class SortAString{
	public static void main(String[] args){
		String str = "Apple";		
		System.out.println("Original string: " + str);
		
		char[] charArray = str.toCharArray();
		
		for (int i = 0; i < charArray.length - 1; i++) {
            for (int j = 0; j < charArray.length - i - 1; j++) {
                if (charArray[j] > charArray[j + 1]) {
                    char temp = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = temp;
                }
            }
        }
		String sortStr = new String(charArray);
        System.out.println("Sorted string: " + sortStr);
	}
}