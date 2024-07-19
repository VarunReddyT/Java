 /*Program to demonstrate ArrayIndexOutOFBoundsException*/

class demo4
{
    public static void main(String args[])
    {
        int a[]={10,20,30,40,50};
        
        try
        {
		System.out.println(a[0]);
		System.out.println(a[5]);
		System.out.println(a[1]);
        }
	catch(ArrayIndexOutOfBoundsException ae)
        {
           System.out.println("Invalid index"); 
        }
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);
    }
}
