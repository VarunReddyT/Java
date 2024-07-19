class operator
{
	public static void main(String args[])
	{
		//int a=5, b=10, x = 15, y = 20;
		//System.out.println((a++>b) || (x++<y));//true
		//System.out.println(a+" "+b+" "+x+" "+y);//6 10 16 20
		
		
		int a=10;

		int b=10;

		System.out.println(a++ + ++a);

		System.out.println(b++ + ++b);
		
		
		/*if(a<20 | ++b<20)//logical or operaor
		{
			System.out.println(a+" " + b);//10 21
		}
		int c=10,d=20;
		if(c<20 && ++d>20)//short-circuit or operator
		{
			System.out.println(c+" " + d);//10 21
		}*/
		int c=10,d=20;
		int x= c>d? c++ : d++;
		System.out.println(x+" "+c +" " + d);
	}
}
/*Shift operators

x=10;
x<<2;x=40

x=5;
x>>2;x=1

*/









