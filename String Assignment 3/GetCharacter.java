// Ques - 10 Java String Program to Get a Character From the Given String

import java.util.Scanner;

class GetCharacter{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A string :");
		String inputStr = sc.nextLine();
		
		System.out.print("Enter the index: ");
		int index = sc.nextInt();
		if(index>=0 && index < inputStr.length()){
			char ch = inputStr.charAt(index);
			System.out.println("Character at index " + index + ": " + ch);
		}else{
			System.out.println("Invalid index!");
		}
	}
}