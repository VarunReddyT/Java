/* to demonstrate advantage of handling exception.

program to get the following output in same order 
 Use exception handling
 
Hello
KMIT
10/0 is invalid operation
All the Best 
Bye

*/
import java.util.*;
class demo2
{
    public static void main(String rags[])
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Hello");
    System.out.println("KMIT");
	int a=sc.nextInt();
	int b=sc.nextInt();
	
    try
    {
        System.out.println(a/b);
    }
    catch(ArithmeticException ae)
    {
        System.out.println(ae.getMessage());
    }
    System.out.println("All the Best");
    System.out.println("Bye");
    }
}
