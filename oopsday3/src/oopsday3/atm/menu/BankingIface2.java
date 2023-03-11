package oopsday3.atm.menu;

import oopsday3.atm.exception.InsufficientFundsException;
import oopsday3.atm.exception.NegativeAmountException;

public interface BankingIface2 {
	
	public double withdraw(double amount,int acctno) throws InsufficientFundsException;
	public double deposit(double amount, int acctno)throws NegativeAmountException;
	public double balanceEnquiry(int actno);

}
