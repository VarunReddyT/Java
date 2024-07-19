//Method Overloading: changing data type of arguments

class Adder
{  
	int add(int a, int b)
	{
		return a+b;
	}  

	double add(double a, double b)
	{
	      return a+b;
	}  
}  

class Test1
{  
    public static void main(String[] args)
    {  
	Adder a=new Adder();
	System.out.println(a.add(11,11));  
    	System.out.println(a.add(12.3,12.6));  
    }
}  