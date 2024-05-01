// Ques - 19 Java String Program to Determine the Unicode Code Point at a given index

class UnicodeCodePoint{
	public static void main(String[] args){
		String str = "Apple";
        int index = 1;
		
		if (index >= 0 && index < str.length()) {
            int codePoint = str.codePointAt(index);
            
            System.out.println("Unicode code point index " + index + " is: " + codePoint);
        } else {
            System.out.println("Index out of bounds.");
        }
	}
}
