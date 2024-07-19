/* One Dimenstional Array*/
import java.util.Scanner;
class Test41
{
    public static void main(String args[])
     {
	Scanner sc=new Scanner(System.in);
	int a[][]=new int[3][];//{{1,2,3},{4,5,6},{7,8,9}};
	a[0]=new int[3];
	a[1]=new int[3];
	a[2]=new int[3];

	int i,j;
	for(i=0;i<a.length;i++)
	{
		for(j=0;j<a[i].length;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
   	for(i=0;i<a.length;i++)
	{
		for(j=0;j<a[i].length;j++)
		{
			System.out.println(a[i][j]);
		}
	}


      }
}
