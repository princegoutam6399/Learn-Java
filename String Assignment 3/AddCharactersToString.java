// Ques - 7 Java String Program to  Add Characters to a String

class AddCharactersToString{
	public static void main(String[] args){
		String str="Hello World";
		String add= "";
		
		String modifyStr=str+add;
		System.out.println("Modify String "+modifyStr);
		
		int position= 3;
		modifyStr=str.substring(0,position)+add+str.substring(position);
		System.out.println("Modified string with character added at position " + position + ": " + modifyStr);
	}
}