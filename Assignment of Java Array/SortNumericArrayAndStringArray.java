import java.util.Arrays;

class SortNumericArrayAndStringArray {
    public static void main(String[] args) {
        int[] numericArray = {32, 43, 12, 43, 21};
        String[] stringArray = {"People", "Apple", "Orange", "Banana", "Cat"};
		
        Arrays.sort(numericArray);
        System.out.println("Sorted Numeric Array:");
        for (int num : numericArray) {
            System.out.print(num + " ");
        }
        System.out.println();

// Sorting string array
        Arrays.sort(stringArray);
        System.out.println("Sorted String Array:");
        for (String str : stringArray) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}
