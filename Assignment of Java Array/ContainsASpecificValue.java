// Ques - 5 Write a Java program to test if an array contains a specific value.

class ContainsASpecificValue{
	public static void main(String[] args){
		int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
		boolean found =false;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]==target){
				found= true;
				break;
			}
		}
		if (found) {
            System.out.println("The array contains the value " + target);
        } else {
            System.out.println("The array does not contain the value " + target);
        }
	}
}