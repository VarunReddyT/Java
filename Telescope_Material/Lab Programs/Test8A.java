/*8A
Write a java program to store the employee details in an ArrayList 
and display the employee details in ascending order of their experience. 
Create 'Employee' class with two instance variables Employee name and Employee experience (no. of years).

Sample Input
------------
Enter number of employees:
4
Enter employee details:
Bindu 6
Nikitha 5
Swarajya 12
Hima 3

Sample Output
-------------
Unsorted employee list [Bindu 6, Nikitha 5, Swarajya 12, Hima 3]
Sorted employee list [Hima 3, Nikitha 5, Bindu 6, Swarajya 12]

*/
import java.util.*;
class Employee
{
	String ename;
	int exp;
	Employee(String ename, int exp)
	{
		this.ename= ename;
		this.exp=exp;
	}
	public String toString()
    {
        return ename + " " + exp ;
    }
}
class ExpComparator implements Comparator<Employee> {    
    public int compare(Employee a, Employee b)
    {
        return a.exp - b.exp;
    }
}
class Test8A 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Employee> ar = new ArrayList<Employee>();
		System.out.println("Enter number of employees:");
		int i,n=sc.nextInt();
		System.out.println("Enter employee details:");
		for(i=0;i<n;i++)
		{
			String name=sc.next();
			int exp=sc.nextInt();
			ar.add(new Employee(name,exp));	
		}
		
		System.out.println("Unsorted employee list "+ar);
		Collections.sort(ar, new ExpComparator());
		System.out.println("Sorted employee list "+ar);
	}
}
