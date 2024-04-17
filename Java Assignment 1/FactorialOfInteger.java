// Ques - 10 How can you find the factorial of an integer in Java?

class FactorialOfInteger{
	public static void main(String[] args){
		int num =2;
		int fact =1;
		for(int i=2;i<=num;i++){
			fact = fact*i;
		}
		System.out.println("Factorial of Number :"+fact);
	}
}