// Ques - 12 Java String Program to Swapping Pair of Characters

class SwappingPairCharacters {
    public static void main(String[] args) {
        String str = "abcdefgh";
        System.out.println("Original String: " + str);
        
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length - 1; i += 2) {
            char temp = charArray[i];
            charArray[i] = charArray[i + 1];
            charArray[i + 1] = temp;
        }
        
        String swappedStr = new String(charArray);
        System.out.println("Swapping Pairs: " + swappedStr);
    }
}
