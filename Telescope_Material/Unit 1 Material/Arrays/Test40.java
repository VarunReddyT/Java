//for-each disadvantage

class Test40
{
	public static void main(String args[])
	{
		int[] a=new int[6];  //integer array
		a[0]=10;
		a[1]=20;
		a[2]=30;

		for(int a1:a)
		{
			System.out.print(a1+" ");
			a1+=2;
		}
		System.out.println();
		for(int a1:a)
			System.out.print(a1+" ");
	}
}