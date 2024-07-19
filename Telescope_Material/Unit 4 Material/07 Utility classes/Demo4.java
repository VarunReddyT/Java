import java.util.Random;  
public class Demo4 
{  
    public static void main(String[] args) 
	{  
       		
        Random random= new Random();			
        
        System.out.println("Random boolean value : "+random.nextBoolean()); 
		System.out.println("Random double value : "+random.nextDouble());
		System.out.println("Random float value : "+random.nextFloat());
		System.out.println("Random int value : "+random.nextInt());
		 
		System.out.println("Random int value between 0 to 10: "+random.nextInt(10));
		
		//Generates random bytes and places them into a user-supplied byte array
	    byte[] bytes = new byte[10];  
        random.nextBytes(bytes);    	
        System.out.println("\nRandom bytes = ");  
        for(int i = 0; i< bytes.length; i++)  
        {  
            System.out.print(bytes[i] + " ");  
        }  
		
    }  
}  