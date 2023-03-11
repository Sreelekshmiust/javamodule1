package oopsday2.atm;

public interface BankingIface2 {
	public double withdraw(double amount,int acctno);
	public double deposit(double amount, int acctno);
	public double balanceEnquiry(int actno);

}
