// What is the output for the above program?
// Options :
// A.Runtime error
// B.A  // ^ Correct Answer
// C.Compilation error
// D.cannot access s

package pack1;
 
class A
{
    protected static String s = "A";
}
 
class B extends A
{
     
}
 
class C extends B
{   
    static void methodOfC()
    {
        System.out.println(s);
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        C.methodOfC();
    }
}