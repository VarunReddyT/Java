 /*multiple threads */

class Thread1 extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(getName()+" = "+i);
        }
    }
}
class Thread2 extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(getName()+" = "+i);
        }
    }
}
class demo4
{
    public static void main(String args[])
    {
        Thread1 f=new Thread1(); 
        Thread2 s=new Thread2();
		Thread1 t=new Thread1();
		System.out.println(f.getName());
		System.out.println(s.getName());
		System.out.println(t.getName());
        f.setName("FirstThread");
        s.setName("SecondThread");
		t.setName("ThirdThread");
        f.start();
        s.start();
		t.start();

    }
}

