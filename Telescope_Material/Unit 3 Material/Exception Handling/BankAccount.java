//User defined unchecked Exception

class InSuffFunds extends RuntimeException
{
	InSuffFunds(String str)
	{
		super(str);
	}
	
}
public class BankAccount
{
	int bal,accno;
	public BankAccount(int no, int balance)
	{
		accno=no;
		bal=balance;
	}
	public void withdraw(int amount)
	{
		if(amount<=bal)
		{
			bal=bal-amount;
			System.out.println("Withdraw amount:"+amount);
		}
		else
			throw new InSuffFunds("You have Insufficient funds");
	}
	public static void main(String args[])
	{
		BankAccount obj=new BankAccount(101,5000);
		obj.withdraw(4000);
		obj.withdraw(2000);
		System.out.println("Transaction completed");
	}
}