// Ex-2 MultiThreading 


class Base extends Thread{
	public void run(){
		try{
			for(int i=1;i<=10;i++){
				System.out.println(i);
				Thread.sleep(500);
			}
		}catch(Exception e){
			//System.out.println("Exception Error");
			e.printStackTrace();
		}
	}
}

class MultiThreadingEx{
	public static void main(String[] args){
		Base obj = new Base();
		obj.start();
		try{
			for(int i=11;i<=20;i++){
				System.out.println(i);
				Thread.sleep(500);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}