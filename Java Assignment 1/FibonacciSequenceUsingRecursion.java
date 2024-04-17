// Ques-5 Write a Java program to print a Fibonacci sequence using recursion

class FibonacciSequenceUsingRecursion{
	public static void main(String[] args){
		int num =4;
		for(int i=2;i<=num;i++){
		System.out.print(fibonacci(i) + " ");	
		}
	}
	public static int fibonacci(int num) {
        if (num <= 1) {
            return num;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}