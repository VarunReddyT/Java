
public class account1 {
	private int accNo;
	String accHolderName;
	private float balance;
	account1(int accNumber,String accHolderName,float bal){
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
		System.out.println(amt + " Deposited");
	}
	float getbalance(){
		System.out.println("Balance :");
		return balance;
	}
    public static void main(String[] args){
		account1 a = new account1(96184,"Varun Reddy",0);
		a.deposit(30000);
		System.out.println(a.getbalance());
		a.withdraw(200);
		System.out.println(a.getbalance());
	}
}
