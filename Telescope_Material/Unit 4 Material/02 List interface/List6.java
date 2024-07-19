 //Java Program to sort user-defined class objects using Comparable Interface

import java.util.*;  
class Student implements Comparable<Student>
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
	 
	public int compareTo(Student st)
	{  
		/*if(age > st.age)  
			return 1;  
		else if(age < st.age)  
			return -1;  
		else  
			return 0; */


			return name.compareTo(st.name);
	} 
	public String toString()
	{
		return rollno+":"+name+":"+age;
	}
}  
	
  
public class List6 
{  
	public static void main(String[] args) 
	{  
		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(new Student(101,"Vijay",23));  
		al.add(new Student(106,"Ajay",27));  
		al.add(new Student(105,"Jai",21));  
		al.add(new Student(108,"Tahir",25));  
		System.out.println(al);
		Collections.sort(al);//, Collections.reverseOrder());  
		System.out.println(al);  
		 
	}  
}  