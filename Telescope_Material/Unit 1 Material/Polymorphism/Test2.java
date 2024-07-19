//Ambiguous while invoking overloaded method

class overload
{
   	public void m1(int i, float f)
	{
	     System.out.println("int-float version");
	}
	
	public void m1(float f,int i)
	{
	     System.out.println("float -int version");
	}
}
public class Test2
{
   	public static void  main(String args[])
    {
		overload t=new overload();  
		t.m1(10,10.5f);

		t.m1(10.5f,10);

		t.m1(10,10);
	}
}
