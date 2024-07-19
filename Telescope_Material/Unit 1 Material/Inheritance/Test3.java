/*Hierarchical Inheritance Example*/



class Animal
{  
	void eat()
	{
	System.out.println("eating...");
	}  
} 
 
class Dog extends Animal
{  
	void bark()
	{
	System.out.println("barking...");
	}  
}  

class Cat extends Animal,Dog
{  
	void meow()
	{
	System.out.println("meowing...");
	}  
}
  
class Test3
{  
	public static void main(String args[])
	{  
		Cat c=new Cat();  
		c.meow();  
		c.eat();  
		c.bark();//Compile time Exception
	}
}  