import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class Checking_Account extends Account {
	public Checking_Account(int account_id, double account_balance) {
		super(account_id, account_balance);
		this.account_id = account_id;
		this.account_balance = account_balance;
	}

	private LocalDate creation_date; 
	
	public Checking_Account(int account_id, double account_balance, LocalDate creation_date) {
		super(account_id, account_balance);
		this.creation_date = creation_date;
	}
	
	
	public void deposit(int amount)
	{
		account_balance += amount;
	}
	
	public void withdraw(int amount,int account_id)
	{
		if(account_balance <= 0 && amount > account_balance)
			
		{
			System.out.println("The account balance is not enough to proceed. ");
		}else if(account_balance > 0 && amount < account_balance)
			
		{
			account_balance -= amount;
		}
	} 
		public void printCheckingInfo()
		{
			System.out.println("Checking Account info: \nID: " + getAccount_id() + "\nBalance: " + getAccountBalance() + "$"  + "\nCreated on: " + creation_date);
		}
	}

