/*
 * 
 * o An Account should have an Account Number and an Account Balance.
 * 
o An Account can be either a Savings Account or a Checking Account.

o In case of a Savings Account:
▪ A Savings account should have a creation date.
▪ A Savings account should print all the account information.
▪ A Savings account should calculate the interest, according to the days that have passed
from the time that the customer created the account.
• If less than 2 months have passed, it should add 5% interest for each month in
the account balance.
• If less than 4 months have passed, it should add 10% interest for each month in
the account balance.
• Else it should add 12% interest for each month in the account balance.

*/
 
public class Account {

	protected int account_id;
	protected double account_balance;
	protected String acc_type;

	
	public Account(int account_id, double account_balance )
	{
		this.account_id = account_id;
		this.account_balance = account_balance;
		
	}
	
	public String getAccType()
	{
		return this.acc_type;
	}
	public int getAccount_id()
	{return account_id;}
	
	public double getAccountBalance()
	{
		return account_balance;
	}
	
	public void printAccountInfo() {
		System.out.println("Account id: " + getAccount_id() + "Account Balance: " + getAccountBalance());
	}
	
}
