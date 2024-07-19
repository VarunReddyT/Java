//Java Program to sort user-defined class objects using Java Comparator

import java.util.*;
class Student
{  
	int rollno;  
	String name;  
	int age;  
	Student(int rollno,String name,int age)
	{  
		this.rollno=rollno;  
		this.name=name;  
		this.age=age;  
	} 
	public String toString()
	{
		return rollno+":"+name+":"+age;
	}	
}
class AgeComparator implements Comparator<Student>
{  
	public int compare(Student s1,Student s2)
	{  
		if(s1.age>s2.age)  
			return 1;  
		else if(s1.age<s2.age)  
			return -1;  
		else  
			return 0;  
	}  
}
class NameComparator implements Comparator<Student>
{  
	public int compare(Student s1,Student s2)
	{  
		return s1.name.compareTo(s2.name);  
	}  
} 

class List7
{  
	public static void main(String args[])
	{  
		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(new Student(101,"Vijay",23));  
		al.add(new Student(106,"Ajay",27));  
		al.add(new Student(105,"Jai",21));  
		al.add(new Student(108,"Ram",25));
		
		System.out.println("Sorting by Name");    
		Collections.sort(al,new NameComparator());  
		System.out.println(al);  
		  
		System.out.println("Sorting by age");    
		Collections.sort(al,new AgeComparator());  
		System.out.println(al);  
	}  
}   