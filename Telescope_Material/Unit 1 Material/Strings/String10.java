class String10
{
	public static void main(String args[])
	{
		//CHAR ARRAY TO STRING
		char ch1[]={'k','m','i','t'};
		String s1=String.copyValueOf(ch1);
		System.out.println(s1);
		
		//String to char array
		String s2="ngit";
		char ch2[]=s2.toCharArray();
		for(char c:ch2)
			System.out.print(c+" ");

		String s3="hello students";
		boolean b=s3.endsWith("students");
		System.out.println("s3 ends with students: "+b);
	}
}