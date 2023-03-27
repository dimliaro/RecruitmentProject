import java.time.LocalDate;
public class Main {

	
		public static void main (String[] args)
		{
		
			Bank bank = new Bank("Alpha Bank");
			Customer c = new Customer ("John" ,  "Doe" , "johnDoe@gmail.com" , 1001); //John being registered
			bank.addCustomer(c,"Kifisia Branch"); //into bank's list in Branch of Kifissia
			bank.print_customers();

			Savings_Account savings_account = new Savings_Account(1001, 0,  LocalDate.of(2020,1,27));//Create an Account 
			c.addAccount(savings_account); //add the account to Customer's List of accounts

			savings_account.deposit(200);
			savings_account.add_interest();
			savings_account.printInfoSavings();
			
			Checking_Account checking_account  = new Checking_Account(2001, 0, LocalDate.of(2020, 2, 12)); //Create another Account
			c.addAccount(checking_account); // add the second Account into Customer's List as well
			checking_account.deposit(145);
			checking_account.printCheckingInfo();
			
			Checking_Account checking_account2  = new Checking_Account(2002, 0, LocalDate.of(2021, 01, 30)); //Create another Account
			c.addAccount(checking_account2); // add the second Account into Customer's List as well
			
				
				checking_account.deposit(160);
				checking_account.printCheckingInfo();
				
		}
}
