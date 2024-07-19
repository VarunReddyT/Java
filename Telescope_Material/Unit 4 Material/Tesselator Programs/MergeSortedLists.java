/* Given two sorted Linked Lists, Write a Java program to merge them into the 
new list in sorted order.

Sample Input : 
10 20 30 40 50 -1
15 25 35 45 -1

Sample Output : 
10 15 20 25 30 35 40 45 50
 
*/


import java.util.*;
class Test
{
	public static void main(String args[]) 
	{
	    Scanner sc=new Scanner(System.in);
		List<Integer> list1 = new LinkedList<Integer>();
        List<Integer> list2 = new LinkedList<Integer>();
        List<Integer> list3 = new LinkedList<Integer>();
        int temp=0;
        while((temp=sc.nextInt()) !=-1)
            list1.add(temp);
            
        while((temp=sc.nextInt()) !=-1)
            list2.add(temp);
		
        int i=0,j=0,l1=list1.size(),l2=list2.size();
        
        while(i<l1 && j<l2)
        {
            if(list1.get(i)<list2.get(j))
            {
                list3.add(list1.get(i));
                i++;
            }
            else
            {
                list3.add(list2.get(j));
                j++;
            }
        } 
        while(i<l1)
        {
            list3.add(list1.get(i));
            i++;
        }
        while(j<l2)
        {
            list3.add(list2.get(j));
            j++;
        }
		
		System.out.println(list3.toString().replace("[","").replace("]","").replace(",",""));
	}
}
/*test cases:
case=1
input=10 20 30 40 -1                                                                                                          
5 15 24 26 38 39 42 48 52 -1                                                                                            
output=
5 10 15 20 24 26 30 38 39 40 42 48 52                                                                                   

case=2
Input=10 20 30 40 50 -1
15 25 35 45 -1
Output=
10 15 20 25 30 35 40 45 50

case=3
input=1 5 6 8 15 18 25 29 35 38 -1                                                                                            
10 20 30 -1                                                                                                             
output=
1 5 6 8 10 15 18 20 25 29 30 35 38                                                                                      
*/