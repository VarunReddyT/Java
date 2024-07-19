/*Write a Java program to fill the below pattern into a square matrix:
The matrix has to be filled with numbers starting from 1. It has to start fill first row last column, last row (reverse), first column (reverse) and so on. Please refer the following example 
input  = 5
output =
1      2     3     4    5   
16    17    18    19    6   
15    24    25    20    7   
14    23    22    21    8   
13    12    11    10    9
*/
import java.util.*;
class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
        int rowBegin = 0;
        int rowEnd = n-1;
        int colBegin = 0;
        int colEnd = n-1;
		int[][] a=new int[n][n];
		int c=1;
        while (rowBegin<= rowEnd&&colBegin<= colEnd) 
		{
            // Traverse Right
            for (int j = colBegin; j <= colEnd; j ++) {
                a[rowBegin][j]=c++;
            }
			rowBegin++;

            // Traverse Down
            for (int j = rowBegin; j <= rowEnd; j ++) {
                a[j][colEnd]=c++;
            }
			colEnd--;
            
			// Traverse Left
			for (int j = colEnd; j >= colBegin; j --) {
				a[rowEnd][j]=c++;
			}
            rowEnd--;
     
			// Traver Up
			for (int j = rowEnd; j >= rowBegin; j --) {
				a[j][colBegin]=c++;
			}
            colBegin ++;
        }

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}
}
