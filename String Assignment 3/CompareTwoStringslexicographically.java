// Ques - 21 Java String Program to Compare two strings lexicographically

class CompareTwoStringslexicographically{
	public static int CompareStr(String str1,String str2){
		int s1 = (int)str1.charAt(0);
		int s2 = (int)str2.charAt(0);
		return s1-s2;
	}
	public static void main(String[] args){
		String str1 = "Aman";
        String str2 = "Rachit";
		
		int num = CompareStr(str1,str2);
		if(num>0)
			System.out.println("First String is Greater");
		else
			if(num==0)
				System.out.println("Both String are equal");
			else	
				System.out.println("First String is Smaller");
	}
}