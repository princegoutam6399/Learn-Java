class Bye implements Runnable{
	public void run(){
		try{
			for(int i=1;i<=12;i++){
				System.out.println(i);
				Thread.sleep(500);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
class Hello{
	public static void main(String[] args){
		
		Thread obj = new Thread(new Bye());
		obj.start();
		try{
			for(char i='a';i<='j';i++){
				System.out.println(i);
				Thread.sleep(550);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}