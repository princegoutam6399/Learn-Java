// Ques -3  Write a Java program to check if a vowel is present in a string.

class VowelIsPresentInAString {
    public static void main(String[] args) {
        String str = "PEOPLE";
        System.out.println("My String is: " + str);
        
        boolean vowelPresent = false;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i)== 'e' || str.charAt(i)== 'i' ||str.charAt(i)== 'o' || str.charAt(i) == 'u') {
                vowelPresent = true;
                break;
            }
        }
        
        if (vowelPresent)
            System.out.println("Vowel Is Present In String");
        else
            System.out.println("Vowel Is Not Present In String");
    }
}
