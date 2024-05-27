// Ques - 1 Write a Java program to create and start multiple threads that increment a shared counter variable concurrently.

class Counter{
	private int count = 0;
	
	public synchronized void increment(){
		count++;
	}
	public int getValue(){
		return count;
	}
}

class CounterIncrement implements Runnable{
	private Counter counter;
	
	public CounterIncrement(Counter counter){
		this.counter=counter;
	}
	
	public void run(){
		 int numIncrement=100;
		for(int i=0;i<numIncrement;i++){
			counter.increment();
		}
	}
}

class MultipleThreads{
		public static void main(String[] args){
			int num = 5;
			Counter counter = new Counter();
			
			Thread[] threads = new Thread[num];
			for(int i=0;i<num;i++){
				threads[i] = new Thread(new CounterIncrement (counter));
				threads[i].start();
			}
			
			for(int i=0;i<num;i++){
				try{
					threads[i].join();
				}catch(Exception e){
					System.out.println("Exception Error");
				}
			}
			System.out.println(" counter value: " + counter.getValue());
		}
}