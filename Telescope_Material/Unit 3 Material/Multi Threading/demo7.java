/* program to demonstrate yield() method of Thread class can stop the currently executing thread and will give a chance to 
other waiting threads of the same priority.*/

class  MyThread extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Child Thread "+i);
            if(i==5)
                Thread.yield();
        }
    }
}

class demo7
{
    public static void main(String args[])
    {
        MyThread m=new MyThread();
		m.setPriority(1);
        m.start();
        for(int i=0;i<10;i++)
        {
            System.out.println("Main Thread "+i);
        }
    }
}


