import java.util.Scanner;
public class UserInput6 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username : ");

        // String userName = myObj.next(); Reads only the first word
        String userName = myObj.nextLine(); // Reads the whole line
        
        System.out.println("Username is: " + userName);
        //There's a potential resource leak issue because we're not closing the Scanner object after we're done using it.
        //We can fix this by adding the following line of code at the end of the main method:
        
        myObj.close();
    }
}
