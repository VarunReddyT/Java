// var-arg methods it is available from 1.5 version

class overload
{
   	public void m1(int x)
	{
	     System.out.println("general method");
	}
	
	public void m1(int...x)
	{
	     System.out.println("var-arg method");
	}
}
public class Test3
{
    public static void  main(String args[])
    {
		overload t=new overload();  
		t.m1(10);
		t.m1(10,20,30);
	}
}
/*in general 'var-argument ' will get least priority , 
if no other method  matched, then only  'var-argument' will get the chance*/