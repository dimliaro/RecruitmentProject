
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/*
 * o In case of a Checking Account:
▪ A Checking account should have a creation date.
▪ A Checking account should print all the account information.
▪ A Checking Account should be able to deposit and withdraw money for the account
balance given.
▪ In case of withdrawal, if the amount to be withdrawn is larger than the account balance,
the transaction should not execute 
*/

import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  
public class Savings_Account  extends Account {
private LocalDate creation_date;
private LocalDate curr_date = LocalDate.now();
private String type = "Savings";
private double interest;
	public Savings_Account(int account_id, double account_balance, LocalDate creation_date) {
		super(account_id, account_balance);
		this.creation_date = creation_date;
	}
	
	
	
	
	
	 

	//Assuming interest is annual. So 1% interest monthly. 
	//Calculating interest with type FutureValue  = Value * ( 1 + interestRate/12) ^ monthsOpen 
	public double add_interest()
	{
		 long monthsOpen = ChronoUnit.MONTHS.between(creation_date, curr_date);
		 System.out.println("Months passed: " + monthsOpen);
		 if(monthsOpen < 2 )
		 {
			 account_balance  = account_balance + Math.pow(1+(0.05/12), monthsOpen);
			return account_balance;
		 }else if(monthsOpen<4) {
			 account_balance  = account_balance + Math.pow(1+(0.1/12), monthsOpen);
				return account_balance;

		 }else 
			 account_balance  = account_balance + Math.pow(1+(0.12/12), monthsOpen);
			return account_balance;

	}
	
	public LocalDate getCreationDate(LocalDate creation_date)
	{
		return this.creation_date;
	}
	public void setSavings_Balance(double account_balance)
	{
		this.account_balance = account_balance;
	}
	public double getSavings_balance()
	{
		return this.account_balance;
	}
	public void deposit(int amount)
	{
		setSavings_Balance(getAccountBalance() + amount);
	}
	
	public void withdraw(int amount)
	{
		if(account_balance <= 0 && amount > account_balance)
			
		{
			System.out.println("The account balance is not enough to proceed. ");
		}else if(account_balance > 0 && amount < account_balance)
			
		{
			setSavings_Balance(getAccountBalance() - amount);
		}
	} 
	
	
	public void printInfoSavings()
	{
		
		System.out.println("Savings account info: \n" + "Id: " + getAccount_id() + "\nBalance: " + getAccountBalance() + "$" +"\nCreated on: " + creation_date );
		
	}
	
}
