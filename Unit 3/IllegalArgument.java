import java.util.Scanner;
public class IllegalArgument {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();

        if(age<0){
            throw new AgeException();
        }
    }
}
