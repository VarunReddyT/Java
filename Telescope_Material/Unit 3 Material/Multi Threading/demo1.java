/*program to create a thread by extending Thread class*/

class MyThread extends Thread
{
    public void run()//Running
    {
        for(int i=1;i<=10;i++)
        {
          System.out.println("Child Thread :"+i);
        }
    }
}

class demo1
{
    public static void main(String args[])
    {
        MyThread m=new MyThread();//New
		System.out.println(m);
		m.start();//Runnable
        for(int i=1;i<=10;i++)
        {
            System.out.println("Main Thread:"+i);
        }
		
    }
}


