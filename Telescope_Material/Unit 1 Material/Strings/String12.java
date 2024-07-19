public class String12
{  
	public static void main(String args[])
	{  
		int value=30;  
		String s1=String.valueOf(value);  
		System.out.println(s1+10); //concatenating string with 10  
		
		boolean bol = true;    
        boolean bol2 = false;    
        String s2 = String.valueOf(bol);    
		String s3 = String.valueOf(bol2);  
       	System.out.println(s2);  
        System.out.println(s3);
		
		char ch1 = 'A';    
        char ch2 = 'B';  
        String s4 = String.valueOf(ch1);    
        String s5 = String.valueOf(ch2);  
        System.out.println(s4);  
        System.out.println(s5); 
		
		float f  = 10.05f;    
        double d = 10.02;  
        String s6 = String.valueOf(f);    
        String s7 = String.valueOf(d);  
        System.out.println(s6);  
        System.out.println(s7);  
	}
}  