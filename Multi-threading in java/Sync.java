// Ex -1  Synchronization in java


class Base {
	synchronized void test(int n){
		try{
			for(int i=1;i<=5;i++){
				System.out.println(i+n);
				Thread.sleep(1000);
			}
		}catch(Exception e){
			System.out.println("Exception Error");
		}
	}
}

class Sync{
	public static void main(String[] args){
		Base obj = new Base();
		Thread a = new Thread(){
			public void run(){
				obj.test(5);
			}
		};
		Thread b = new Thread(){
			public void run(){
				obj.test(10);
			}
		};
		a.start();
		b.start();
	}
}