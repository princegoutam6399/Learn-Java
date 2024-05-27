// Ex-1 MultiThreading 

class Base extends Thread{
	public void run(){
			for(int j=11;j<=20;j++){
				System.out.println(j);
			}
	}
}

class Multithreading{
	public static void main(String[] args){
		Base obj=new Base();
		obj.start();
		for(int i=0;i<=10;i++){
			System.out.println(i);
		}
	}
}