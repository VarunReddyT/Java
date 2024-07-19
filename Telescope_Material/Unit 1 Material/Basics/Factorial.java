//Calculating factorial of a number using command line arguments

class Factorial
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		int i,f=1;
		for(i=1;i<=n;i++)
			f=f*i;
		System.out.println("Factorial of "+n+" is "+f);
		System.out.println(args[1]);
	}
}

/*
Compilation step: javac Factorial.java
Execution step: java Factorial 6
Output:	Factorial of 6 is 720
*/
