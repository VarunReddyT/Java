import java.util.Scanner;
class account{
	private int accNo;
	String accHolderName;
	private float balance;
	private int transactions;
	float balanceAmt;
	account(int accNumber,String accHolderName,float bal,int transactions){
		this.accNo = accNumber;
		this.accHolderName = accHolderName;
		this.balance = bal;
		this.transactions = transactions;
	}
	void withdraw(float amt){
		if(amt > balance){
			System.out.println("Low Balance");
			return;
		}
		this.balance = balance-amt;
		System.out.println("Withdrawn "+amt);
		transactions++;
	}
	void deposit(float amt){
		this.balance = balance + amt;
		System.out.println("Deposited " + amt);
		transactions++;
	}
	float getbalance(){
		System.out.print("Balance : ");
		balanceAmt = balance;
		return balanceAmt;
	}
	void welcome(){
		System.out.println("Welcome to the bank, " + this.accHolderName);
	}
	int getTransacions(){
		return transactions;
	}
}
public class bank3 {
    public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		account a = new account(96184,"Varun Reddy",0,0);
		a.welcome();
		boolean flag = true;
		while(flag){
			System.out.println("Enter 1 for deposit, 2 for withdraw, 3 to check balance, 4 to check number of transactions, 5 to exit");
			int choice = obj.nextInt();
			switch(choice){
				case 1:
					System.out.println("Enter the deposit amount : ");
					float depositAmt = obj.nextFloat();
					a.deposit(depositAmt);
					break;
				case 2:
					System.out.println("Enter the withdraw amount : ");
					float withdrawAmt = obj.nextFloat();
					a.withdraw(withdrawAmt);
					break;
				case 3:
					System.out.println(a.getbalance());
					break;
				case 4:
					System.out.print("Number of transactions are : ");
					System.out.println(a.getTransacions());
					break;
				case 5:
					flag = false;
					break;
				default:
					System.out.println("Enter valid choice");
					break;
			}
		}

		obj.close();
	}
}
