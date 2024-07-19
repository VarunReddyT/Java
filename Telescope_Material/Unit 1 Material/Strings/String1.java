class String1
{
	public static void main(String args[])
	{

	String str1 = "Hello World";
	String str2 = "Hello World";
	String str3 = new String("Hello World");
	  
	System.out.println(str1.hashCode());
	System.out.println(str2.hashCode());
	System.out.println(str3.hashCode());

	String s5=str1+str2;
	System.out.println("New string="+str1.concat(str2));
	System.out.println("String 1=" + str1);
	
	System.out.println(str1.compareTo(str2));
	String str4 = "hello world";
	System.out.println(str1.compareTo(str4));
	System.out.println(str1.compareToIgnoreCase(str4));


   }

}