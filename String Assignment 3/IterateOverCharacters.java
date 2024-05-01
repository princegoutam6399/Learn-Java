// Ques - 8 Java String Program to Iterate Over Characters in String

class IterateOverCharacters{
	public static void main(String[] args){
		String str="People";
		
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			System.out.println(ch);
		}
	}
}