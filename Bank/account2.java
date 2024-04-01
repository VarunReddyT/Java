
class account2 {
	private int accNo;
	String accHolderName;
	private float balance;
	private int transactions;
	float balanceAmt;
	account2(int accNumber,String accHolderName,float bal,int transactions){
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