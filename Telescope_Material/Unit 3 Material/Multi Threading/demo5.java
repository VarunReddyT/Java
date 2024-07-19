/* Example on priorities*/

class demo5 extends Thread 
{
   public void run() 
   {
		System.out.println("Child thread priority:"+getPriority());
     
		for(int i=0;i<10;i++)
			System.out.println("child thread "+i);
   }

   public static void main(String[] args) 
   {
       	demo5 t1 = new demo5();
       	System.out.println(t1);
       	t1.setPriority(8);
       	t1.start();	
		
		System.out.println("Main Thread Priority:"+ Thread.currentThread().getPriority());
		for(int i=0;i<10;i++)
			System.out.println("Main thread "+i);
   }
}

