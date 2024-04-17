// Ques -9 How do you sort an array in Java?

 class SortAnArray{
	 public static void main(String[] args){
		 int[] arr = {32,43,12,54,23};
		 for(int i=0;i<arr.length;i++)
			 for(int j=0;j<arr.length - 1;j++)
				 if(arr[j] > arr[j+1]){
					 int temp = arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]= temp;
				 }
				 System.out.println("Sort Array :"+arr);
	 }
 }