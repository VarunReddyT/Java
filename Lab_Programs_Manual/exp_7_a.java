// 7.a. Write a Java Class to implement a method Addition() that returns a new Array where each array element at the index k corresponds to the sum of elements of the array (src) starting at index 0 and including element at the index ‘k’. For example, for array [2,3,5], the method will return array [2,5,10]. For an array of size ‘0’ or a null parameter, the method will throw exception IllegalArgumentExceptionWith the message “Invalid Argument”.
import java.util.*;
public class exp_7_a {
    public static int[] addition(int[] arr){
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            arr[i] += sum;
            sum = arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int n = sc.nextInt();
        int arr[];
        try{
            if(n>0){
                arr = new int[n];
            }
            else{
                sc.close();
                throw new IllegalArgumentException();
            }
            System.out.println("Enter Array elements : ");
            for(int i = 0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int[] result = addition(arr);
            System.out.println(Arrays.toString(result));

        }
        catch(IllegalArgumentException e){
            System.out.println("Illegal Argument");
        }
    }
}
