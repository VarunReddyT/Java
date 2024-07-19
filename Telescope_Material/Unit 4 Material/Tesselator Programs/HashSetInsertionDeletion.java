/* Write a Java program to add Strings into an HashSet then remove the specified
element from hashset and display the Hashset

Sample 1:

Enter the size of set: 5                                                                                                
Enter the elements:                                                                                                     
iphone                                                                                                                  
samsung                                                                                                                 
redmi                                                                                                                   
vivo                                                                                                                    
realme                                                                                                                  
HashSet: [samsung, realme, redmi, vivo, iphone]                                                                         
Enter a string to delete:                                                                                               
iphone                                                                                                                  
Updated set after deletion:                                                                                             
samsung                                                                                                                 
realme                                                                                                                  
redmi                                                                                                                   
vivo                                                                                                                    
 

Sample 2:
Enter the size of set: 3                                                                                                
Enter the elements:                                                                                                     
kmit                                                                                                                    
ngit                                                                                                                    
stanley                                                                                                                 
HashSet: [ngit, stanley, kmit]                                                                                          
Enter a string to delete:                                                                                               
stanley                                                                                                                 
Updated set after deletion:                                                                                             
ngit                                                                                                                    
kmit  
*/

import java.util.*;
class Test
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of set: ");
        int n=sc.nextInt();
        //sc.next();
        Set<String> set1=new HashSet<String>();
		
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++)
            set1.add(sc.next());
        System.out.print("HashSet: ");
        System.out.println(set1);
        System.out.println("Enter a string to delete: ");
        set1.remove(sc.next());
        System.out.println("Updated set after deletion: ");
        Iterator itr = set1.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
    }
}
/*test cases:
case=1
input=5
iphone                                                                                                                  
samsung                                                                                                                 
redmi                                                                                                                   
vivo                                                                                                                    
realme
iphone
output=
Enter the size of set:                                                                                                 
Enter the elements:                                                                                                     
HashSet: [samsung, realme, redmi, vivo, iphone]                                                                         
Enter a string to delete:                                                                                               
Updated set after deletion:                                                                                             
samsung                                                                                                                 
realme                                                                                                                  
redmi                                                                                                                   
vivo                                                                                                                    

case=2
input=3
kmit                                                                                                                    
ngit                                                                                                                    
stanley                                                                                                                 
stanley 
output=
Enter the size of set:                                                                                                 
Enter the elements:                                                                                                     
HashSet: [ngit, stanley, kmit]                                                                                          
Enter a string to delete:                                                                                               
Updated set after deletion:                                                                                             
ngit                                                                                                                    
kmit                                                                                                                    
*/