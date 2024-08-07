// b. Write a Java program to fill the below pattern into a square matrix:
// The matrix has to be filled with numbers starting from 1. It has to start fill first row last column, last row (reverse), first column (reverse) and so on. Please refer the following example 
// input  = 5
// output =
// 1      2     3     4    5   
// 16    17    18    19    6   
// 15    24    25    20    7   
// 14    23    22    21    8   
// 13    12    11    10    9
import java.util.*;
public class exp_3_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rowBegin = 0;
        int rowEnd = n-1;
        int colBegin = 0;
        int colEnd = n-1;
        int [][] matrix = new int[n][n];

        while(rowBegin<=rowEnd && colBegin<=colEnd){
            for(int i = colBegin;i<=colEnd;i++){
                matrix[rowBegin][i] = sc.nextInt();
            }
            rowBegin++;
            for(int i = rowBegin;i<=rowEnd;i++){
                matrix[i][colEnd] = sc.nextInt();
            }
            colEnd--;
            for(int i = colEnd;i>=colBegin;i--){
                matrix[rowEnd][i] = sc.nextInt();
            }
            rowEnd--;
            for(int i = rowEnd;i>=rowBegin;i--){
                matrix[i][colBegin] = sc.nextInt();
            }
            colBegin++;
        }
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
