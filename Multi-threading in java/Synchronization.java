// Ex - 2 Deadlock in java


class common{
		public static void sleep(int sec){
			try{
				Thread.sleep(sec);
			}catch(Exception e){
				System.out.println("Exception Error");
			}
		}
}

class A{
	synchronized public void test1(A obj2){
		System.out.println(Thread.currentThread().getName()+" Using Test1");
		common.sleep(1000);
		obj2.test2();
		System.out.println(Thread.currentThread().getName()+" Using Test1");
		
	}
	synchronized public void test2(){
		System.out.println(Thread.currentThread().getName()+" Using Test2");
		common.sleep(1000);
	}
}

class MyThread1 extends Thread{
	private A obj1;
	private A obj2;
	MyThread1(A obj1,A obj2){
		this.obj1=obj1;
		this.obj2=obj2;
	}
	public void run(){
		obj1.test1(obj2);
	}
}

class MyThread2 extends Thread{
	private A obj1;
	private A obj2;
	MyThread2(A obj1,A obj2){
		this.obj1=obj1;
		this.obj2=obj2;
	}
	public void run(){
		obj1.test1(obj1);
	}
}

class Synchronization{
	public static void main(String[] args){
		A obj1 = new A();
		A obj2 = new A();
		MyThread1 t1= new MyThread1(obj1,obj2);
		t1.setName("first thread");
		t1.start();
		
		common.sleep(1000);
		MyThread2 t2= new MyThread2(obj1,obj2);
		t2.setName("second thread");
		t2.start();
		
	}
} 