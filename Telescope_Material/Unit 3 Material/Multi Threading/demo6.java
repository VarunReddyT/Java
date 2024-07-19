/*program to demonstrate join() method which permits one thread to wait
until other thread to finish its execution.*/

class MyThread extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Child Thread");
            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException ie)
            {
				System.out.println(ie);
            }
        }
    }
}
class demo6
{
    public static void main(String args[]) throws InterruptedException
    {
        MyThread t=new MyThread();
        t.start();
        t.join();
        for(int i=0;i<10;i++)
        {
            System.out.println("Main Thread");
			Thread.sleep(500);
        }
    }
}

