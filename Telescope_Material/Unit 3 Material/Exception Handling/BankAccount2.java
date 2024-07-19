//User defined Checked Exception

class InSuffFunds extends Exception
{
	InSuffFunds(String str)
	{
		super(str);
	}
}
public class BankAccount2
{
	int bal,accno;
	public BankAccount2(int no, int balance)
	{
		accno=no;
		bal=balance;
	}
	public void withdraw(int amount)throws InSuffFunds
	{
		if(amount<=bal)
		{
			bal=bal-amount;
			System.out.println("Withdraw amount:"+amount);
		}
		else
			throw new InSuffFunds("Insufficient funds");
	}
	public static void main(String args[])
	{
		BankAccount2 ba=new BankAccount2(101,5000);
		try
		{
			ba.withdraw(4000);
			ba.withdraw(2000);
		}
		catch(InSuffFunds is)
		{
			System.out.println(is.getMessage());
		}
		System.out.println("Transaction completed");
	}
}