/* Process synchronization example */
class Display
{
	public synchronized void wish(String name)
	{
		for(int i=0;i<10;i++)
		{
			System.out.print("Good morning : ");
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e){} 
			
			System.out.println(name);
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
		//System.out.println(getName());
		d.wish(name);
	}
}
class demo9
{
	public static void main(String args[])
	{
		Display d=new Display();
		Mythread t1= new Mythread(d,"Shiva");
		Mythread t2= new Mythread(d,"Smitha");
		t1.start();
		t2.start();
	}
}

