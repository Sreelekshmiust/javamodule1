package oopsday2.atm;

public interface BankingIface {
	public double withdraw(double amount);
	public double deposit(double amount);
	public double balanceEnquiry(int actno);

}
