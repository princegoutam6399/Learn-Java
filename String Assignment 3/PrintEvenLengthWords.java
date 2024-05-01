// Ques - 1 Java String Program to Print even length words

class PrintEvenLengthWords {
    public static void main(String[] args) {
        String str = "Ram Is a good boy and he is a student";
        String[] words = str.split(" ");
        
        System.out.println("Even length Words:");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() % 2 == 0) {
                System.out.println(words[i]);
            }
        }
    }
}

