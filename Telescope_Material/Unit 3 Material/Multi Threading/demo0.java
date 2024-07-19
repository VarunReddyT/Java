 // Java Program to demonstrate main thread
class demo0
{
	public static void main(String args[])
	{
		Thread t=Thread.currentThread(); //reference of the current thread
		System.out.println(t);	// thread’s name, priority, and thread group
		
		t.setName("thread1");
		System.out.println(t);

		for(int i=1;i<=3;i++)
		{
			try
			{
				Thread.sleep(2000);//ms
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println("i = "+i); 
		}
	}
}
