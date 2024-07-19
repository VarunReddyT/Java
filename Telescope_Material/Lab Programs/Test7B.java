/*
Write a Java Code to implement a multithreaded version of FizzBuzz with four threads. 
If the number is divisible by 3, output "fizz".
If the number is divisible by 5, output "buzz".
If the number is divisible by both 3 and 5, output "fizzbuzz".
If the number is not divisible by both 3 and 5 print the number 
For instance if  n  is  15, we will have the output as "1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz"

1. Thread A will call fizz() to check for divisibility of 3 and outputs fizz .
2. Thread B will call buzz() to check for divisibility of 5 and outputs buzz .
3. Thread C will call fizzbuzz() to check for divisibility of 3 and 5 and outputs fizzbuzz .
4. Thread D will call number() which should only output the numbers.

Sample IO:
----------
17
1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17

*/
import java.util.Scanner;
class A extends Thread
{
	int i;
	A(int x)
	{
		i=x;
	}
	public void run()
	{
		fizz();
	}
	public void fizz()
	{
		if(i%3==0 && i%5!=0)
			System.out.print("Fizz"+" ");
	}
}

class B extends Thread
{
	int i;
	B(int x)
	{
		i=x;
	}
	public void run()
	{
		Buzz();
	}
	public void Buzz()
	{
		if(i%5==0 && i%3!=0)
			System.out.print("Buzz"+" ");
	}
}

class C extends Thread
{
	int i;
	C(int x)
	{
		i=x;
	}
	public void run()
	{
		fizzbuzz();
	}
	public void fizzbuzz()
	{
		if(i%15==0)
			System.out.print("FizzBuzz"+" ");
	}
}

class D extends Thread
{
	int i;
	D(int x)
	{
		i=x;
	}
	public void run()
	{
		number();
	}
	public void number()
	{
		if(i%3!=0 && i%5!=0 && i%15!=0)
			System.out.print(i+" ");
	}
}
class TestFizz
{
	public static void main(String args[])throws Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			A t1=new A(i);
			t1.start();
			t1.join();

			B t2=new B(i);
			t2.start();
			t2.join();

			C t3=new C(i);
			t3.start();
			t3.join();

			D t4=new D(i);
			t4.start();
			t4.join();
		}
	}
}



