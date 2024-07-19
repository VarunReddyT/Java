/* Java enum where we are using values(), valueOf(), and 
ordinal() methods of Java enum.
*/
public class Ex2 
{ 
    enum color 
    { 
        RED, GREEN, BLUE; 
    } 
  public static void main(String[] args) 
    { 
        for (color c : color.values())  
			System.out.println(c); 
     
		System.out.println("Value of RED is: "+color.valueOf("RED"));  
		System.out.println("Index of RED is: "+color.valueOf("RED").ordinal());  
		System.out.println("Index of GREEN is: "+color.valueOf("GREEN").ordinal());
	}
}