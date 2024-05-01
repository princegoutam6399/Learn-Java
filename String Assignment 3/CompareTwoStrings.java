// Ques - 20 Java String Program to Compare two strings

class CompareTwoStrings{
	public static void main(String[] args){
		String str1="Hello";
		String str2="India";
		
		int res = str1.compareTo(str2);
        
        if (res < 0) {
            System.out.println("String 1 is greater String 2");
        } else if (res > 0) {
            System.out.println("String 1 is smaller String 2");
        } else {
            System.out.println("Both strings are equal");
        }
	}
}