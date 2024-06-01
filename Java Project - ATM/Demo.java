import java.util.Scanner;
import java.io.FileWriter;

class Demo{
	static String Name = "Aman Kumar";
	static String Mobile = "+91 8921789389";
	static int pin;
	static int Balance = 20000;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		System.out.println("*** SBI Bank ***");
		System.out.print("Enter Your Pin :");
		pin = sc.nextInt();
		
		if(pin==6399){
			int flag = 1;
			while(flag==1){
				System.out.println("\n1. Check Balance ");
				System.out.println("2. Withdrawl ");
				System.out.println("3. Deposit ");
				System.out.println("4. Change Pin ");
				System.out.println("5. Exit ");
				System.out.println("Enter Your Choice : ");
				
				int choice = sc.nextInt();
				
				switch(choice){
					case 1:
					CheckBal();
					System.out.print("Press 1 To Print : ");
					int value = sc.nextInt();
					if(value==1)
					Print(0,0);
					break;
					case 2:
					Withdrawl();
					break;
					case 3:
					Deposit();
					break;
					case 4:
					ChangePin();
					break;
					case 5:
						System.out.println("Bye Bye Customer");
						flag=0;
					break;
					default:
						System.out.println("Wrong Entered");
				}
			}
		}else{
			System.out.println("Incorrect Pin");
		}
	}
	public static void CheckBal(){
		System.out.println("Your Current Balance :"+Balance);
	}
	
	public static void Withdrawl(){
		System.out.println("(Withdrawl)\n Enter Your Amount: ");
		int amt = sc.nextInt();
		if(amt<=Balance){
			Balance = Balance-amt;
			System.out.println("Withdrawl Success :"+amt);
			System.out.println("Current Balance:"+Balance);
			System.out.print("Press 1 To Print : ");
					int val = sc.nextInt();
					if(val==1)
						Print(amt,0);
		}else{
			System.out.println("Insufficient Balance !");
		}
	}
	
	public static void Deposit(){
			System.out.println("(Deposit)\n Enter Your Amount :");
			int amt = sc.nextInt();
			Balance = Balance+amt;
			System.out.println("Deposit Success :"+amt);
			System.out.println("Current Balance :"+Balance);
			System.out.print("Press 1 To Print : ");
					int val = sc.nextInt();
					if(val==1)
						Print(0,amt);
	}
	
	public static void ChangePin(){
		System.out.println("Enter New Pin :");
		int newPin = sc.nextInt();
		System.out.println("Re-Enter Your Pin :");
		int rePin = sc.nextInt();
		
		if(newPin==rePin){
			pin=newPin;
			System.out.println("Pin Change Successfully ");
		}else{
			System.out.println("Pin Can't Change");
		}
	}
	public static void Print(int with,int dep){
		try{
			FileWriter w = new FileWriter("abc.txt");
			String str ="\nCustomer Name "+Name+
						"\nCustomer Mobile : "+Mobile+
						"\nWithdrawl : "+with+
						"\nDeposit : "+dep+
						"\nCurrent Balance : "+Balance+
						"\nThank You!";
			w.write(str);
			System.out.println(str);
			w.close();
		}catch(Exception e){
			System.out.println("File Error!");
		}
	}
	
}