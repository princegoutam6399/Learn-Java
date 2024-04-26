// Ques - 13 Write a Java program to find duplicate values in an array of string values

import java.util.Arrays;

class FindDuplicateValuesInArrayofString {
    public static void main(String[] args) {
        String[] str = {"Ram is a good boy and he is a student"};
        
        String[] words = str[0].split("\\s+");
        
        for (int i = 0; i < words.length; i++) {
            int count = 0;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "-1"; 
                }
            }
            if (count > 0 && !words[i].equals("-1")) {
                System.out.println("Duplicate Value: " + words[i]);
            }
        }
    }
}
