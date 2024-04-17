// Ques -15 WAP to find all the prime numbers from 100 to 200.

class PrimeNumbers {
	public static void main(String[] args){
		int start =100;
		int end = 200;
		int count =0;
		
		for(int num=start;num<=end;num++){
			 boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && num > 1) {
                System.out.println("Prime Number: " + num);
            }
		}
		
	}
}