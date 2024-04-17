// Ques -4 Write a Java program to check if the given number is a prime number.


class NumberIsPrimeNumber{
	public static void main(String[] args){
		int num=13;
		int count=0;
		
		for(int i=1;i<=num;i++){
			if(num%i==0){
				count++;
			}
		}	
		if(count==2)
			System.out.println("Number Is Prime");
		else
			System.out.println("Number Is Not Prime");
	}	
}