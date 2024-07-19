//Java program to illustrate PriorityQueue with user defined class objects

import java.util.*; 
class Student 
{ 
	public String name; 
	public double cgpa; 
	public Student(String name, double cgpa) 
	{ 
		this.name = name; 
		this.cgpa = cgpa; 
	} 
	public String toString()
	{
		return name+":"+cgpa;
	}
} 
class cgpaComparator implements Comparator<Student>
{ 
	public int compare(Student s1, Student s2) //ascending order of cgpa
	{ 
		if (s1.cgpa < s2.cgpa) 
			return -1; 
		else if (s1.cgpa > s2.cgpa) 
			return 1; 
		else
			return 0; 
	} 
} 

public class PQueue3 
{ 
	public static void main(String[] args)
	{ 
		Scanner in = new Scanner(System.in); 
		cgpaComparator cc=new cgpaComparator();
		PriorityQueue<Student> pq = new PriorityQueue<Student>(cc); 
		Student student1 = new Student("Kavya", 8.2); 
		pq.add(student1); 
		Student student2 = new Student("Navya", 9.6); 
		pq.add(student2);		 
		Student student3 = new Student("Veena", 6.0); 
		pq.add(student3); 
		
		System.out.println(pq);
			
		System.out.println("Students served in their cgpa priority order"); 
		
		while(!pq.isEmpty()) 
		{
			System.out.println(pq.poll());
		}while(!pq.isEmpty()) 
		{
			System.out.println(pq.poll());
		}
	} 
} 
