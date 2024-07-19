/* Two dimensional array using foreach loop*/

class Test37
{
    public static void main(String args[])
     {
	
	int[][] a={{10,20,30},{40,50}};
	
	// Iterating over one dimension
      	  // results in one dimensional array
	     
	    for(int[] a1:a)
	       {
	          // Iterating over one dimension
	             for(int a2:a1)
		{
		     System.out.println(a2);	
   	   	 }
                         }
       }
}