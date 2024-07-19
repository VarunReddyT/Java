/* Write a program to create a thread by implementing interface Runnable-adding sleep() */

class MyThread implements Runnable 
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            try
            {
               Thread.sleep(2000);
            }
            catch(InterruptedException e)
            { 
               System.out.println(e);
            }   
            System.out.println("Child Thread:"+i);
        }
    }
}
class demo3
{
    public static void main(String args[])
    {
        MyThread m1=new MyThread();
        Thread t1=new Thread(m1);
        t1.start();
        for(int i=0;i<10;i++)
        {
            try
            {
               Thread.sleep(500);
            }
            catch(InterruptedException e)
            { 
               System.out.println(e);
            }
            System.out.println("Main Thread:"+i);
        }
    }
}

