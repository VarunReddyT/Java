// To demonstrate throw keyword

class demo14
{
	static void meth1()
	{
		try
		{
			throw new ArithmeticException();
		}
		catch(ArithmeticException e)  
		{
			System.out.println("caught inside method:"+e);
		}
	}
	public static void main(String args[])
	{
		meth1();
	}
} 


