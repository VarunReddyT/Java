/*program to demonstrate NullPointerException for Scanner class object 
*/

import java.util.*;

class demo5
{
    public static void main(String args[])
    {
        Scanner s=null;
        //s=new Scanner(System.in);
        try
        {
            int a=s.nextInt();
        }
        catch(NullPointerException ne)
        {
            System.out.println(ne);
        }
    System.out.println("End of the program");
    }
}
