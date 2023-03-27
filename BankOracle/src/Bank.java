import java.util.ArrayList;

/*
 * Bank
o A Bank should have a Bank Name.

o A Bank could have one or more Bank Branches. (For example: Test Bank Kifissia Branch, Test
Bank Marousi Branch, Test Bank Cholargos Branch etc.)

o Each branch should have a name.

o A Bank should be able to add or remove a customer and print all customers.

*/
public class Bank {

	private String bank_name;
	private ArrayList<Customer> customers;
	
	
	public Bank(String bank_name)
	{
		this.bank_name = bank_name;
		this.customers = new ArrayList<>();
	}
	public void addCustomer(Customer customer, String branch_name)
	{
		customer.setBranchName(branch_name);
		customers.add(customer);
	}
	public void removeCustomer(Customer customer, String branch_name)
	{
		
		customers.remove(customer);
	}
	public void print_customers()

	{
		for(Customer c: this.customers)
		{
			System.out.println("Here is a list of our customers: " +c.getFirstName() + " " +  c.getLastName());
			System.out.println("_______________________");
		}
	}
	
	
	public String getBankName()
	{
		return bank_name;
	}
	
	
}
