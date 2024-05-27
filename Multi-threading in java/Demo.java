// Ex-1 implements

class Base implements Runnable{
	public void run(){
		try{
			for(int i=1;i<=10;i++){
				System.out.println(i);
				Thread.sleep(500);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

class Demo{
	public static void main(String[] args){
			Thread obj=new Thread(new Base());
			obj.start();
			try{
				for(int i=11;i<=30;i++){
					System.out.println(i);
					Thread.sleep(500);
				}
			}catch(Exception e){
				System.out.println("Exception Error");
			}
	}
} 