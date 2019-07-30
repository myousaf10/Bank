package july_29;

public class BankAccount {
		private int account_number = 123456789;
		private double balance = 50.0;
		private String customer_name = "Yousaf";
		private String	email = "Yousaf@gmail.com";
		private int phone_number = 123456789;
		
		public void set_balance(double new_amount) {
			
			if (new_amount<=50)
			{
			balance=balance+new_amount;
			System.out.println("Available Balance " + balance);
		}
			else
				System.out.println("Only amount less than $50 can be deposited ");
		}
		
		public void withdraw(double withdraw_amount) {
			if(balance>0 && (balance-withdraw_amount)>0)
			{
			balance=balance-withdraw_amount;
			System.out.println("Customer Name " + customer_name);
			System.out.println("Available Balance " + balance);
			}
			else 
				System.out.println("Can not Perform the Transaction");
		}
		
		public void print() {
			System.out.println("\nCustomer Name: " + customer_name);
			System.out.println("Account Number: " + account_number);
			System.out.println("Available Balance: " + balance);
			System.out.println("Email ID Registered to the user: " + email);
			System.out.println("Phone Number Registered to the user: " + phone_number);
			
		}
		
		public double get_balance() {
			return this.balance;
		}
		
		
		
}
