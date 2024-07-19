interface Personelbanking
{
	float reporate=7.5f; 

	void lending_funds();
	void checkClearence();
	int Deposit_Amt(int amt);
	int withDraw_Amt(int amt);
	
	static void displayRepo()
	{
		System.out.println(reporate);
	}
}