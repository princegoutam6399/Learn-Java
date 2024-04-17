// Ques-1 How do you reverse a string in Java?

class ReverseAString{
	public static void main(String[] args){
		String str ="BAMAN";
		String rev="";
		System.out.println("My String Is :"+str);
		for(int i=str.length()-1;i>=0;i--)
			rev=rev+str.charAt(i);
			System.out.println("Reverse String is:"+rev);
	}
}