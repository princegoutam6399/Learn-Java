// Ques - 15 Java String Program to Remove leading zeros

import java.util.Scanner;

class RemoveleadingZeros{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter A string :");
		String inputStr = sc.nextLine();
		
		int startIndex = 0;
		
		while(startIndex<inputStr.length() && inputStr.charAt(startIndex
	)=='0'){
		startIndex++;
	}	
		String resString=inputStr.substring(startIndex);
		System.out.println("Result After Remove zeros :"+resString);
		
	}
}