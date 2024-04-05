import java.util.Scanner;
public class Methods1{
    public static Scanner input = new Scanner(System.in);
    public static String getCustomerName(){
        System.out.println("Enter your name : ");
        String name = input.next();
        return name;
    }
    public static String getPanCardNo(){
        System.out.println("Enter your Pan Card number : ");
        String pancard = input.next();
        return pancard;
    }
    public static int getVoterId(){
        System.out.println("Enter your Voter I'd number : ");
        int voterid = input.nextInt();
        return voterid;
    }
    public static String getPassportNo(){
        System.out.println("Enter your Passport number : ");
        String passport = input.next();
        return passport;
    }
    public static int getLicenseNo(){
        System.out.println("Enter your License number : ");
        int license = input.nextInt();
        return license;
    }
    public static long[] getTelephoneNo(){
        System.out.println("Enter your phone numbers (Primary and alternate) : ");
        long[] telephone = new long[2];
        for(int i = 0;i<2;i++){
            telephone[i] = input.nextLong();
        }
        return telephone;
    }

    public static boolean checkPass(){
        System.out.println("Do you have a passport ? Enter y for yes or n for no");
        String status = input.next();
        if(status.equals("y")){
            return true;
        }
        return false;
    }
}
