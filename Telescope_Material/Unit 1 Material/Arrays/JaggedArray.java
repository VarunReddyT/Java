class JaggedArray
{
	public static void main(String []args)
	{
		int arr[][] = new int[3][];
		arr[0]=new int[3];
		arr[1]=new int[4];
		arr[2]=new int[2];
		int i,j,count=0;
		for(i=0;i<arr.length;i++)
			for(j=0;j<arr[i].length;j++)
				arr[i][j]=count++;
		
		for(int k[]:arr)
		{
			for(int x:k)
				System.out.print(x+" ");
			System.out.println();
		}
	}
}