// Ques - 14 Java String Program to Replace a Character at a Specific Index

import java.util.Scanner;

class ReplaceCharacterSpecificIndex{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter A String :");
		String inputStr=sc.nextLine();
		
		System.out.print("Enter Your Index :");
		int index = sc.nextInt();
		
		System.out.print("Enter The Character of Replace :");
		char replaceChar=sc.next().charAt(0);
		
		if(index >0 && index < inputStr.length()){
			String repStr=inputStr.substring(0,index)+replaceChar+inputStr.substring(index+1);
			System.out.print("Result :"+repStr);
		}else{
			System.out.print("Invalid Index!");
		}
	}
}