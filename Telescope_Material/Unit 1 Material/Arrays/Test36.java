/* Two dimensional array using for loop*/

class Test36
{
    public static void main(String args[])
    {
	
	int[][] a={{10,20,30},{40,50},{1,2,3,4}};//Jagged array
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			System.out.print(a[i][j]+" ");	
		}
		System.out.println();
	}
	}
}