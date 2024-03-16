class account2 {
	private int accNo;
	String accHolderName;
	private float balance;
	account2(int accNumber,String accHolderName,float bal){
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