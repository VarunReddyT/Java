interface Atm
{
	int Deposit_Amt(int amt); //public abstract methods
	int withDraw_Amt(int amt);
	int checkBalance(); 

	default void pinchange()
	{
		System.out.println("Do u really want to change the pin");
	}
	
}