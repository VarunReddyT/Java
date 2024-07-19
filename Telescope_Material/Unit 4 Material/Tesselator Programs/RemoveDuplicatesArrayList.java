/*Write a Java program to remove duplicate strings from ArrayList and 
Display the output in acsending order

Sample 1:
input=7
JAVA
APPLETS
JSP
SERVLETS
JAVA
STRUTS
JSP

output =
[APPLETS, JAVA, JSP, SERVLETS, STRUTS]

Sample 2:
input=5                                                                                                                       
ngit                                                                                                                    
kmit                                                                                                                    
kmit                                                                                                                    
ngit                                                                                                                    
cvr                                                                                                                     
output=
[cvr, kmit, ngit]                                                                                                       
                                                                                                                        
   
*/
import java.util.*;
class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> list = new ArrayList<String>();
        for(int i=0;i<n;i++)
        {
            list.add(sc.next());
        }
        
        TreeSet<String> ts = new TreeSet<String>(list);
        System.out.print(ts);
    }
}
/*Test cases:
case=1
input=7
JAVA
APPLETS
JSP
SERVLETS
JAVA
STRUTS
JSP
output =
[APPLETS, JAVA, JSP, SERVLETS, STRUTS]

case=2
input=5                                                                                                                       
ngit                                                                                                                    
kmit                                                                                                                    
kmit                                                                                                                    
ngit                                                                                                                    
cvr                                                                                                                     
output=
[cvr, kmit, ngit]                                                                                                       

*/
