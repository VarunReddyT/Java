
import java.util.Scanner;
class account {
	private int accNo;
	String accHolderName;
	private float balance;
	account(int accNumber,String accHolderName,float bal){
		this.accNo = accNumber;
		this.accHolderName = accHolderName;
		this.balance = bal;
	}
	void withdraw(float amt){
		if(amt > balance){
			System.out.println("Low Balance");
			return;
		}
		this.balance = balance-amt;
		System.out.println("Withdrawn "+amt);
	}
	void deposit(float amt){
		this.balance = balance + amt;
		System.out.println("Deposited " + amt);
	}
	float getbalance(){
		System.out.print("Balance : ");
		return balance;
	}
	void welcome(){
		System.out.println("Welcome to the bank, " + this.accHolderName);
	}
    
}
public class bank{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		account a = new account(96184,"Varun Reddy",0);
		a.welcome();

		System.out.println("Enter the deposit amount : ");
		float depositAmt = obj.nextFloat();
		a.deposit(depositAmt);

		System.out.println(a.getbalance());

		System.out.println("Enter the withdraw amount : ");
		float withdrawAmt = obj.nextFloat();
		a.withdraw(withdrawAmt);

		System.out.println(a.getbalance());

		obj.close();
	}
}
