// Ques - 3 Java String program to check whether a string is a Palindrome

class StringIsPalindrome{
	public static void main(String[] args){
		String str="NAMAN";
		int flag=1;
		int start=0;
		int end = str.length()-1;
		
		while(start<end){
			if(str.charAt(start)!=str.charAt(end))
				flag=0;
				start++;
				end--;		
		}
		if(flag==1){
				System.out.println("String Is Palindrome");
			}else{
				System.out.println("String Is Not Palindrome");
		}
	}
}

 