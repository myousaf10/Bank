package july_29;
import java.util.Scanner;
public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Car car1=new Car();
		//car1.start("Z4");
		//car1.stop("Volvo");
		//car1.color="Blue";
		//System.out.println(car1.color);
		
		BankAccount b1=new BankAccount();
		//b1.set_balance(100);
		//b1.withdraw(175);
		//b1.print();
		
		boolean flag=true;
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Welcome to the ABC Bank");
		while(flag)
		{
		
		System.out.println("\nSelect the Option");
		System.out.println("Press 1 to View Account Balance");
		System.out.println("Press 2 to Deposit Money");
		System.out.println("Press 3 to Withdraw Money");
		System.out.println("Press 4 to Print All the Details");
		System.out.println("Press 0 to Exit");
		int option = myObj.nextInt();
		
		
		switch (option) {
		  case 1:
		    System.out.println(b1.get_balance());
		    break;
		  case 2:
		    System.out.println(" \n Enter the Amount to Deposit");
		    double new_amount=myObj.nextDouble();
		    b1.set_balance(new_amount);
		    break;
		  case 3:
		    System.out.println(" \n Enter the Amount to Withdraw");
		    double withdraw_amount=myObj.nextDouble();
		    b1.withdraw(withdraw_amount);
		    break;
		  case 4:
			    b1.print();
			    break;
		  case 0:
		    System.out.println("Thank You for Banking with us");
		    flag=false;
		    break;
		  default:
			   System.out.println("Not a Valid Option ");
		}
		}
		}

	}


