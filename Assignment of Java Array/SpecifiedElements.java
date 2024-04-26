// Ques - 32 Write a Java program to check if an array of integers contains two specified elements 65 and 77.

class SpecifiedElements{
	public static void main(String[] args){
		int[] arr = {10, 20, 30, 65, 40, 77, 50};
		boolean num1=false;
		boolean num2=false;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]==65){
				num1=true;
			}
			if(arr[i]==77){
				num2=true;
			}
		}
		System.out.println("array contain both 65 and 77? " + (num1 && num2));
	}
}