/*Note:

->The derived class inherits all the members and methods that are declared as public or protected.

-> If the members or methods of super class are declared as private 
    then the derived class cannot use them directly. 

->The private members can be accessed only in its own class. 
     
->Such private members can only be accessed using public or protected getter and setter methods of super class.


*/

class Teacher
 {
   private String designation = "Teacher";

   private String collegeName = "KMIT";

   public String getDesignation() 
    {
	return designation;
      }

   protected void setDesignation(String designation)
     {
 	this.designation = designation;
      }
  
    protected String getCollegeName() 
     {
	return collegeName;
      }

   protected void setCollegeName(String collegeName) 
   {
	this.collegeName = collegeName;
   }

   void does()
   {
	System.out.println("Teaching");
    }
}

public class Test1 extends Teacher
{
   
	String mainSubject = "Physics";

          public static void main(String args[])
           {
	
		Test1 obj = new Test1();
	
	/* Note: we are not accessing the data members 
	 * directly we are using public getter method 
	 * to access the private members of parent class
	 */

	System.out.println(obj.getCollegeName());

	System.out.println(obj.getDesignation());

	System.out.println(obj.mainSubject);

	obj.does();
          }
}


/*The important point to note in the above example is 
	->the child class is able to access the private members of parent class through protected 
		methods of parent class. 

	->When we make a instance variable(data member) or method protected, 
	     this means that they are accessible only in the class itself and in child class. 

*/