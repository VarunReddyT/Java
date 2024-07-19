/* One Dimenstional Array  using for-each loop
- it is a enhanced for loop 
- especially implemented for Arrays and collections
- it is available from jdk1.5 version
syntax:
                    for (type var : array) 
                      {  
                               statements using var;
                      }

Note: we can not write equailent for-each loop(enhanced foreach) for normal for loop

-*/
class Test33
{
    public static void main(String args[])
     {
	int[] a={10,20,30,40};

	      	for(int x:a)
	      	{    
			x=x+10;
			System.out.println(x);
	     	}
		for(int x:a)
	      	{    
			System.out.println(x);
	       	}

       }
}