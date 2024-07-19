/* A simple enum example where enum is declared inside any class*/
 
public class Ex1 
{ 
    enum Color 
    { 
        RED, GREEN, BLUE; 
    } 
  
    // Driver method 
    public static void main(String[] args) 
    { 
        for (Color c : Color.values())  
			System.out.println(c); 
    } 
}