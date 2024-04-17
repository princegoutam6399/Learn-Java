//Ques -6  How do you check whether a string is a palindrome in Java?

class StringIsPalindrome{
	public static void main(String[] args){
		String str="NAMAN";
		String rev="";
		System.out.println("My String is :"+str);
		
		for(int i=str.length()-1;i>=0;i--){
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
			System.out.println("String is Palindrome");
		else
			System.out.println("String is Not Palindrome");
			
	}
}