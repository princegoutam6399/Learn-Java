// Ques - 11 Java String Program to Convert String to String Array

class ConvertStringToStringArray{
	public static void main(String[] args){
		String str="Aman is a good boy";
		String[] ch= str.split(" ");
		for(int i=0;i<ch.length;i++){
			System.out.println(ch[i]);
		}
	}
}