 /*Synchronized block example*/
class Display
{
	public  void wish(String name)
	{
		System.out.println("Hello "+name);
		synchronized(this)
		{  
			for(int i=0;i<10;i++)
			{
				System.out.print("Good morning : ");
				try
				{
					Thread.sleep(500);
				}
				catch(InterruptedException e)
				{
				}
				System.out.println(name);
			}
		}
		
	}
}
class Mythread extends Thread
{
	Display d;
	String name;
	Mythread(Display d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
}
class demo10
{
	public static void main(String args[])
	{
		Display d=new Display();
		Mythread t1= new Mythread(d,"Swetha");
		Mythread t2= new Mythread(d,"Smitha");
		t1.start();
		t2.start();
	}
}
    

