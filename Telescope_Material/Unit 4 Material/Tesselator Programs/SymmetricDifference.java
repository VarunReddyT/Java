/* Write a Java program to find the symmetric difference between two sets

Symmetric Difference = (A u B) - (A n B)
i.e resultant set should not contain common elements of both the sets

Sample:
input = 
5       \\set 1 size
ram
rahim
ajay
rishav
aakash
5       \\set 2 size
aakash
ajay
shyam
ram
ravi

output =
[rahim, ravi,  rishav, shyam]

*/
import java.util.*;
class Test
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        TreeSet<String> ts1=new TreeSet<String>();
        TreeSet<String> ts2=new TreeSet<String>();
        int n1=s.nextInt();
        for(int i=0;i<n1;i++)
        {
            ts1.add(s.next());
        }
        int n2=s.nextInt();
        for(int i=0;i<n2;i++)
        {
            ts2.add(s.next());
        }
        TreeSet<String> ts3=new TreeSet<String>(ts1);
        ts1.addAll(ts2);
        ts3.retainAll(ts2);
        ts1.removeAll(ts3);
        System.out.println(ts1);
    }
}
/*test cases:
case=1
input = 5
ram
rahim
ajay
rishav
aakash
5
aakash
ajay
shyam
ram
ravi
output =
[rahim, ravi,  rishav, shyam] 

case=2
input=3                                                                                                                       
a                                                                                                                       
b                                                                                                                       
c                                                                                                                       
4                                                                                                                       
b                                                                                                                       
d                                                                                                                       
a                                                                                                                       
c                                                                                                                       
output=
[d]                                                                                                                     
*/