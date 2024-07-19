//User defined Unchecked Exception: handled with try-catch

class InSuffFunds extends RuntimeException
{
	public String getMessage()//overriding
	{
		return "Account has insufficient funds";
	}
}
public class BankAccount1
{
	int bal,accno;
	public BankAccount1(int no, int balance)
	{
		accno=no;
		bal=balance;
	}
	public void withdraw(int amount)
	{
		try
		{
			if(amount<=bal)
			{
				bal=bal-amount;
				System.out.println("Withdraw amount:"+amount);
			}
			else
				throw new InSuffFunds();
		}
		catch(InSuffFunds isf)
		{
			System.out.println(isf.getMessage());
			System.out.println(isf);
			
		}
	}
	public static void main(String args[])
	{
		BankAccount1 ba=new BankAccount1(101,5000);
		ba.withdraw(4000);
		ba.withdraw(2000);
		System.out.println("Transaction completed");
	}
}