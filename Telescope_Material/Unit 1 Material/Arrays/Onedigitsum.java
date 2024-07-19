import java.util.Scanner;
public class Onedigitsum
{
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        long number = sc.nextLong(); // Change this to your desired number
        int digitSum = findSingleDigitSum(number);
        System.out.println("The single digit sum of " + number + " is: " + digitSum);
    }

    public static int findSingleDigitSum(long number) {
        int sum = findDigitSum(number);
        while (sum >= 10) {
            sum = findDigitSum(sum);
        }
        return sum;
    }

    public static int findDigitSum(long number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10; // Add the last digit to the sum
            number /= 10; // Remove the last digit
        }
        return sum;
    }
}