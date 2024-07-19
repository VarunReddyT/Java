/* Write a program to create a thread by implementing interface Runnable */

class MyThread implements Runnable 
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Child Thread:"+i);
        }
    }
}
class demo2
{
    public static void main(String args[])
    {
        MyThread m=new MyThread();
        Thread t1=new Thread(m);
        t1.start();
        for(int i=0;i<10;i++)
        {
            System.out.println("Main Thread:"+i);
        }
    }
}

