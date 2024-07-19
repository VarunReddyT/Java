// A Java program with overloaded main()

public class Test4
{     
    public static void main(String[] args) 
    {
        System.out.println("Hi Students (from main)");
        Test4.main("Students","of IT");
    }
    public static void main(String arg1) 
    {
        System.out.println("Hi, " + arg1);        
    }
    public static void main(String arg1, String arg2) 
    {
        System.out.println("Hi, " + arg1 + ", " + arg2);
	Test4.main("IT");
    }
}
