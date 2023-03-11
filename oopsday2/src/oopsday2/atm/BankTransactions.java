package oopsday2.atm;

public class BankTransactions {

	public static void main(String[] args) {
		
		BankingIface bom =new BankOfAmerica();
		
		double balance = bom.deposit(250);
		System.out.println("balance after deposit = $" + balance);
		balance = bom.withdraw(30.50);
		System.out.println("balance after withdraw = $" + balance);
	}

}
