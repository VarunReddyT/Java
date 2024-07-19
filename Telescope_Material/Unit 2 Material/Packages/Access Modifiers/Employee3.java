//Protected
package Google;
public class Employee3
{
	protected int id=101;
	protected Employee3()
	{
		System.out.println("Default constructor called");
	} 
	protected void display()
	{
		System.out.println("ID:"+id);
	}  
}
