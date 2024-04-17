// How do you check if a list of integers contains only odd numbers in Java?

class listOfIntegersContainsOnlyOddNumbers{
	public static void main(String[] args){
	int[] list= {11,24,56,67,22,33,23};
		System.out.println("My List :"+list);
		
		for(int i=0;i<=list;i++){
			if(list%2!=0){
				System.out.println("List Of Odd Numbers :"+list[i]);
			}
		}
		
	}
}