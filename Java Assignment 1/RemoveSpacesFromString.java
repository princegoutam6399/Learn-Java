// Ques -7  How do you remove spaces from a string in Java? 

class RemoveSpacesFromString{
	public static void main (String[] args){
		String str="The Lazy Dog";
		System.out.println("My String is:"+str);
		
		String newstr= str.replaceAll("\\s","");
		System.out.println(newstr);
		
	}
}