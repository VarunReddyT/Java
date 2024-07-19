class EncapTest 
{
   private String name;
   private int age;

  
   public void setAge( int newAge) 
   {
      age = newAge;
   }

   public int getAge() 
   {
	   return age;
   }
   public void setName(String newName)
   {
      name = newName;
   }
   public String getName() 
  {
      return name;
   }  
}

class RunEncap 
{
   public static void main(String args[]) 
  {
      EncapTest e = new EncapTest();
      e.setName("James");
      e.setAge(15);
      System.out.print("Name : " + e.getName() + "\nAge : " + e.getAge());
   }
}