// Ques - 4 Java String Program to Check Anagram

import java.util.Arrays;

class CheckAnagram{
	public static void main(String[] args){
		String str1 = "listen";
        String str2 = "silent";
		
		str1=str1.replaceAll(" ","").toLowerCase();
		str2=str2.replaceAll(" ","").toLowerCase();
		
		if(str1.length() !=str2.length()){
			System.out.println("Strigs "+str1+" 'and ' "+str2+" ' are not Anagram");
			return;
		}
		
		char[] charArr1=str1.toCharArray();
		char[] charArr2=str2.toCharArray();
		
		Arrays.sort(charArr1);
		Arrays.sort(charArr2);
		
		if(Arrays.equals(charArr1, charArr2)){
			System.out.println("The strings '" + str1 + "' and '" + str2 + "' are anagrams.");
		}else{
			System.out.println("The strings '" + str1 + "' and '" + str2 + "' are not anagrams.");
		}
	}
}