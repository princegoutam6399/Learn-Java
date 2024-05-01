// Ques - 13 Java String Program to Splitting into a number of sub-strings

import java.util.Scanner;

class SplittingIntoNumberOfSubstrings{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your String:");
		String inputStr=sc.nextLine();
		
		System.out.print("Enter number of substrings: ");
		int numSubStr=sc.nextInt();
		
		int subStrLen=inputStr.length()/numSubStr;
		
		String[] substrings=new String[numSubStr];
		int startIndex=0;
		int endIndex=subStrLen;
		
		for(int i=0;i<numSubStr-1;i++){
			substrings[i]=inputStr.substring(startIndex,endIndex);
				startIndex=endIndex;
				endIndex=endIndex+subStrLen;
			
			substrings[numSubStr-1]=inputStr.substring(startIndex);
			
			System.out.println("Substrings:");
			for(String substring :substrings){
				System.out.println(substring);
			}
			
		}
	}
}