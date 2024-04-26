// Ques - 41 Write a Java program to find the smallest and second smallest elements of a given array.


class SmallestAndSecondSmallest{
	public static void main(String[] args){
		int[] arr={34,21,54,69,90,32};
		int small =Integer.MAX_VALUE;
		int sSmall =Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]<small){
				sSmall=small;
				small=arr[i];
			}else if(arr[i]<sSmall & arr[i] !=small){
				sSmall=arr[i];
			}
		}
		if(sSmall == Integer.MAX_VALUE){
			System.out.println("Second smallest element doesn't exist.");
		}else{
			System.out.println("Smallest element: " + small);
            System.out.println("Second smallest element: " + sSmall);
		}
	}
}