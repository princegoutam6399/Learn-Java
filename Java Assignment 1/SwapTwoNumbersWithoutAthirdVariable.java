// Ques -2   How do you swap two numbers without using a third variable in Java?
		

class SwapTwoNumbersWithoutAthirdVariable{
	public static void main(String[] args){
		int num1 =10;
		int num2 =20;
		System.out.println(num1);
		System.out.println(num2);
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("Swap Number num1:"+num1);
		System.out.println("Swap Number num2:"+num2);
		
	}
}