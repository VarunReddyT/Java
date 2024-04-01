
import java.util.Scanner;

public class savingsAccount {
    private int accNo;
	String accHolderName;
	private float balance;
	private int transactions;
	float balanceAmt;
	boolean lowMinBalance = false;
	Scanner scanner;
	savingsAccount(int accNumber, String accHolderName, float bal, int transactions,Scanner scanner) {
		this.accNo = accNumber;
		this.accHolderName = accHolderName;
		this.balance = bal;
		this.transactions = transactions;
		this.scanner = scanner;
	}

	boolean start(){
		System.out.println("Minimum balance to be maintained is 1500");
		System.out.println("Enter 1 to continue to pay 1500, 2 to exit");
		int choice;
		choice = scanner.nextInt();
		if(choice == 1){
			System.out.println("Account created successfully");
			this.balance = 1500;
			return true;
		}
		else{
			return false;
		}
		
	}
	void withdraw(float amt) {
		if (amt > balance) {
			System.out.println("Low Balance");
			return;
		}
		this.balance = balance - amt;
		System.out.println("Withdrawn " + amt);
		transactions++;
		if(balance < 0){
			System.out.println("Zero Balance");
			lowMinBalance = true;
		}
		else if(balance < 1500){
			System.out.println("Low Balance. Please maintain minimum balance of 1500");
			lowMinBalance = true;
		}
		else{
			lowMinBalance = false;
		}
	}

	void deposit(float amt) {
		this.balance = balance + amt;
		System.out.println("Deposited " + amt);
		transactions++;
		if(balance < 1500){
			System.out.println("Low Balance. Please maintain minimum balance of 1500");
			lowMinBalance = true;
		}
		else{
			lowMinBalance = false;
		}
	}

	float getBalance() {
		System.out.print("Balance : ");
		balanceAmt = balance;
		return balanceAmt;
	}

	void welcome() {
		System.out.println("Welcome to the bank, " + this.accHolderName);
	}

	int getTransactions() {
		return transactions;
	}

	void transfer(savingsAccount b, float amt) {
		if (amt > balance) {
			System.out.println("Low Balance");
			return;
		}
		this.balance = balance - amt;
		b.balance = b.balance + amt;
		System.out.println("Transferred " + amt);
		transactions++;
		if(balance < 0){
			System.out.println("Zero Balance");
			lowMinBalance = true;
		}
		else if(balance < 1500){
			System.out.println("Low Balance. Please maintain minimum balance of 1500");
			lowMinBalance = true;
		}
		else{
			lowMinBalance = false;
		}
	}

	void mobileBanking() {
		System.out.println("Mobile banking facility available");
		System.out.println("Enter 1 to register for mobile banking, 2 to cancel");
		int choice = scanner.nextInt();
		if (choice == 1) {
			System.out.println("Mobile banking registered successfully. Login credentials will be sent to your registered mobile number. For more details, login to your account on the bank's mobile app");
		} else {
			System.out.println("Mobile banking registration cancelled");
		}
	}

	void debitCard() {
		System.out.println("Debit card facility available");
		System.out.println("Enter 1 to request a new debit card, 2 to cancel");
		int choice = scanner.nextInt();
		if (choice == 1) {
			System.out.println("Debit card request submitted successfully, will be delivered in 7 working days");
		} else {
			System.out.println("Debit card request cancelled");
		}
	}

	void onlineBanking() {
		System.out.println("Online banking facility available");
		System.out.println("Enter 1 to register for online banking, 2 to cancel");
		int choice = scanner.nextInt();
		if (choice == 1) {
			System.out.println("Online banking registered successfully. Login credentials will be sent to your registered mobile number. For more details, login to your account on the bank's mobile app");
		} else {
			System.out.println("Online banking registration cancelled");
		}
	}
}
