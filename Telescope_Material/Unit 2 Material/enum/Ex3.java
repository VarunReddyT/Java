/* Example of specifying initial value to the enum constants  */
   
public class Ex3 
{ 
    enum color 
    { 
        RED(4), GREEN(8), BLUE(10); 
		
		private int value;  
		private color(int v)
		{  
			this.value=v;  
		}
    } 
  
    // Driver method 
    public static void main(String[] args) 
    { 
        for (color c : color.values())  
			System.out.println(c+" "+c.value); 
    } 
}