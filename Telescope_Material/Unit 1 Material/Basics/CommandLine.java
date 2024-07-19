class CommandLine
{
	public static void main(String args[])
	{
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		int n1=5,n2;
		n2=n1+Integer.parseInt(args[3]);
		System.out.println("n2 is:"+n2);
	}
}