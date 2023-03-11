package statemachine;

import java.util.Scanner;

public class StateMachine implements StateIface {
	
	int nohun;
	int nofif;
	int notwen;
	int noten;
	int flag=0;
	int result=0;
	int totalamount;
	int result1=0;
	
	private int nof_hun=100;
	private int nof_fif=100;
	private int nof_twen =100;
	private int nof_ten =100;
	
	


	public void menu() {
		while(result<3) {

		Scanner scn = new Scanner(System.in);
		System.out.println("enter the total amount: ");
		totalamount =scn.nextInt();
		System.out.println("enter denomination of 100 : ");
		 nohun = scn.nextInt();
		System.out.println("enter denomination of 50 : "); 
		nofif =scn.nextInt();
		System.out.println("enter denomination of 20 : ");
		notwen =scn.nextInt();
		System.out.println("enter denomination of 10 : ");
		noten =scn.nextInt();	
		
		result=test(totalamount);
		if(result1==0) {
			System.out.println("the amount withdrawn = " + totalamount + "\n the denomination are \n 100*" + nohun + "\n 50*" + nofif + "\n 20*" + notwen + "\n 10*" + noten );
			
		}
		}
		System.out.println("your three chances are over");
		
	}

	@Override
	public int test(int totalamount) {
		if(totalamount == ((nohun*100)+(nofif*50)+(notwen*20)+(noten*10))) {
			if(nohun<=nof_hun) {
				nof_hun-=nohun;
			}
			else {
				System.out.println("Insufficient funds of 100");
				result1++;
			}
			if(nofif<=nof_fif) {
				nof_fif-=nofif;
			}
			else {
				System.out.println("Insufficient funds of 50");
				result1++;
			}
			if(notwen<=nof_twen) {
				nof_twen-=notwen;
			}
			else {
				System.out.println("Insufficient funds of 20");
				result1++;
			}
			if(noten<=nof_ten) {
				nof_ten-=noten;
			}
			else {
				System.out.println("Insufficient funds of 10");
				result1++;
			}
			
			
		}
		else {
			System.out.println("Wrong denomination! Please try again....");
			flag++;
			result1++;
		}
		return flag;
	}
	
	
}
