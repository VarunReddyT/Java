public class Bank implements Atm,Personelbanking
{
	int eno;
	String sname;
	int balance;
	Bank(int e,String n,int b)
	{
		eno=e;
		sname=n;
		balance=b;
	}
	public int Deposit_Amt(int amt)
	{
		balance=balance+amt;
		return balance;
	}
	public int withDraw_Amt(int amt)
	{
		balance=balance-amt;
		return balance;
	}
	int checkBalance()
	{
		return balance;
	}
	public void lending_funds()
	{
		System.out.println("Your loan is sanctioned");
	}
	public void checkClearence()
	{
		System.out.println("Your Check got cleared");
	}
	
	public void pinchange()
	{
		System.out.println("No,I don't want to change the pin");
	}
	
	static void displayRepo()
	{
		System.out.println("The reporate from bank class:"+sname);
	}

	public static void main(String args[])
	{
		sname="bindu";
	Bank b=new Bank(101,"Nikitha",50000);
	Atm a=b;
	System.out.println("New balance after deposit:"+a.Deposit_Amt(5000));
	System.out.println("New balance after withdrawal:"+a.withDraw_Amt(10000));
	
	//System.out.println(a.checkClearence());
		//a.pinchange();
		//a.checkClearence();
		
		Personelbanking p=b;				
		p.lending_funds();
		p.checkClearence();
		System.out.println("New balance after deposit:"+p.Deposit_Amt(5000));
		System.out.println("New balance after withdrawal:"+p.withDraw_Amt(10000));
		//Personelbanking.displayRepo();
		//p.checkBalance();
		
		System.out.println("Repo rate="+Personelbanking.reporate);
		//p.reporate=10f; 
		
	}
}
