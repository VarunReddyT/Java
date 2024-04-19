// What is the output for the above program?
// Options :
// A.1221
// B.Compilation error followed by a runtime error
// C.1221 followed by 1221    // ^ Correct Answer
// D.1221 followed by a compilation error

package pack1;
 
class X
{
    protected int i = 1221;
     
    void methodOfX()
    {
        System.out.println(i);
    }
}
 
public class MainClass2
{
    public static void main(String[] args)
    {
        X x = new X();
         
        System.out.println(x.i);
         
        x.methodOfX();
    }
}
