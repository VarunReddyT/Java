import java.util.Scanner;

public class currentAccount {
	private int accNo;
	String accHolderName;
	private float balance;
	private int transactions;
	private float salary;
	private float overdraftLimit;
	float balanceAmt;
	boolean lowMinBalance = false;
	boolean overdraft = false;
	Scanner scanner;

	currentAccount(int accNumber, String accHolderName, float bal, int transactions, float salary, Scanner scanner) {
		this.accNo = accNumber;
		this.accHolderName = accHolderName;
		this.balance = bal;
		this.transactions = transactions;
		this.salary = salary;
		this.overdraftLimit = 2 * salary;
		this.scanner = scanner;
	}

	boolean start() {
		System.out.println("Minimum balance to be maintained is 10000");
		System.out.println("Enter 1 to continue to pay 10000, 2 to exit");
		int choice;
		choice = scanner.nextInt();
		if (choice == 1) {
			System.out.println("Account created successfully");
			this.balance = 10000;
			return true;
		} else {
			return false;
		}

	}

	void withdraw(float amt) {
		if (balance - amt < -overdraftLimit && overdraft) {
			System.out.println("Low Balance, cannot withdraw more as per overdraft rules");
			lowMinBalance = true;
			return;
		} else if (balance - amt < -overdraftLimit && !overdraft) {
			lowMinBalance = false;
		}
		if (amt > balance) {
			System.out.println("Low Balance");
			return;
		}
		this.balance = balance - amt;
		System.out.println("Withdrawn " + amt);
		transactions++;
		if (balance < 10000) {
			System.out.println("Low Balance. Please maintain minimum balance of 10000");
			lowMinBalance = true;
		} else {
			lowMinBalance = false;
		}
	}

	void deposit(float amt) {
		this.balance = balance + amt;
		System.out.println("Deposited " + amt);
		transactions++;
		if (balance < -overdraftLimit && overdraft) {
			lowMinBalance = true;
		} else if (balance < 10000 && !overdraft) {
			System.out.println("Low Balance Please maintain minimum balance of 10000");
			lowMinBalance = true;
		} else {
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
		System.out.print("Number of Transactions : ");
		return transactions;
	}

	void transfer(currentAccount b, float amt) {
		if (balance - amt < -overdraftLimit) {
			System.out.println("Low Balance, cannot transfer more as per overdraft rules");
			lowMinBalance = true;
			return;
		} else {
			lowMinBalance = false;
		}
		if (amt > balance) {
			System.out.println("Low Balance");
			return;
		}
		this.balance = balance - amt;
		b.balance = b.balance + amt;
		System.out.println("Transferred " + amt);
		transactions++;
		if (balance < 10000) {
			System.out.println("Low Balance");
			lowMinBalance = true;
		} else {
			lowMinBalance = false;
		}
	}

	void checkbook() {
		System.out.println("Checkbook facility available");
		System.out.println("Enter 1 to apply for a new checkbook, 2 to cancel");
		int choice = scanner.nextInt();
		if (choice == 1) {
			System.out.println("Application for checkbook submitted successfully");
		} else {
			System.out.println("Checkbook application cancelled");
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
			System.out.println(
					"Online banking registered successfully. Login credentials will be sent to your registered mobile number. For more details, login to your account on the bank's mobile app");
		} else {
			System.out.println("Online banking registration cancelled");
		}
	}

	void overdraft() {
		System.out.println("Overdraft facility available");
		System.out.println("Enter 1 to apply for overdraft, 2 to cancel");
		int choice = scanner.nextInt();
		if (choice == 1) {
			System.out.println("Overdraft applied successfully. Overdraft limit is " + overdraftLimit
					+ ". Overdraft charges are 12% per month.");
			overdraft = true;
		} else {
			System.out.println("Overdraft application cancelled");
			overdraft = false;
		}
	}
}
