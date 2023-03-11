package oopsday3.atm.menu;
import java.util.Scanner;

import oopsday3.atm.exception.InsufficientFundsException;
import oopsday3.atm.exception.NegativeAmountException;

public class BankMenu {

		BankOfAmerica2 boa =new BankOfAmerica2();
		
		public BankMenu() {
			Account a1 = new Account(101,"john doe","saving",500);
			Account a2 = new Account(102,"jon doe","saving",700);
			Account a3 = new Account(103,"jason doe","salary",850);
			Account a4 = new Account(104,"jonas doe","salary",600);
			Account a5 = new Account(105,"jane doe","salary",750);
			
			
			boa.addAccount(a1);
			boa.addAccount(a2);
			boa.addAccount(a3);
			boa.addAccount(a4);
			boa.addAccount(a5);
		}
		
		public void menu() throws NegativeAmountException {
			
			Scanner scanner=new Scanner(System.in);
			int choice;
			loop: do {
				
				System.out.println("enter choice \n 1.display account \n 2.deposit amount \n 3.withdraw amount \n  4.balance enquiry \n 5.exit");
				
				choice = scanner.nextInt();
				switch(choice) {
				
				case 1: {
					System.out.println("enter actno ");
					int actno=scanner.nextInt();
					boa.displayaccount(actno);
					break;
				}
				case 2: {
					System.out.println("enter actno ");
					int actno=scanner.nextInt();
					System.out.println("enter the amount to deposit");
					int amount = scanner.nextInt();
					double balance = boa.deposit(amount, actno);
					System.out.println(balance);
					break;
				}
				case 3: {
					System.out.println("enter actno ");
					int actno=scanner.nextInt();
					System.out.println("enter the amount to withdraw");
					int amount = scanner.nextInt();
					double balance=0;
					try {
						balance = boa.withdraw(amount, actno);
					} catch (InsufficientFundsException e) {
						e.printStackTrace();
					}
					System.out.println(balance);
					break;
				}
				case 4: {
					System.out.println("enter actno ");
					int actno=scanner.nextInt();
					double balance = boa.balanceEnquiry(actno);
					System.out.println(balance);
					break;
				}
				case 5:{
					break loop;
				}
				}
		
			}while(choice!=5);
		}

		
		
}
