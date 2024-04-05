// * Constructor Overloading

// Enigma has recently opened its internet services in India. The company wants users to register for their internet services. But for the authentication of the user, the company has set criteria as below:
//     • The customer name and two phone numbers (one alternate phone number) are compulsory fields.
//     • The user should have a passport. If the user is not having a passport, he/she can provide anyone of the following combinations:
//     • License number and pan card number.
//     • Voter id and license number.
//     • Pan card and voter id.

import java.util.Scanner;
public class Registration{
    public String customerName;
    private String panCardNo;
    private int voterId;
    private String passportNo;
    private int licenseNo;
    private long[] telephoneNo;

    public static Scanner input = new Scanner(System.in);
    Registration(String customerName, String passportNo, long[] telephoneNo){
        this.customerName = customerName;
        this.passportNo = passportNo;
        this.telephoneNo = telephoneNo;
        System.out.println("Congratulations " + customerName + " You have been successfully registered for our services with the following details:");
        System.out.println("Passport number : " + passportNo);
        System.out.println("Phone numbers : " + telephoneNo[0] + "\n" + telephoneNo[1]);
    }
    Registration(String customerName, int licenseNo, String panCardNo,long[] telephoneNo ){
        this.customerName = customerName;
        this.licenseNo = licenseNo;
        this.panCardNo = panCardNo;
        this.telephoneNo = telephoneNo;
        System.out.println("Congratulations " + customerName + " You have been successfully registered for our services with the following details:");
        System.out.println("License number : " + licenseNo);
        System.out.println("Pan card number : " + panCardNo);
        System.out.println("Phone numbers : " + telephoneNo[0] + "\n" + telephoneNo[1]);
    }
    Registration(String customerName, int voterId, int licenseNo, long[] telephoneNo){
        this.customerName = customerName;
        this.voterId = voterId;
        this.licenseNo = licenseNo;
        this.telephoneNo = telephoneNo;
        System.out.println("Congratulations " + customerName + " You have been successfully registered for our services with the following details:");
        System.out.println("Voter id : " + voterId);
        System.out.println("License number : " + licenseNo);
        System.out.println("Phone numbers : " + telephoneNo[0] + "\n" + telephoneNo[1]);
    }
    Registration(String customerName, String panCardNo, int voterId, long[] telephoneNo){
        this.customerName = customerName;
        this.panCardNo = panCardNo;
        this.voterId = voterId;
        this.telephoneNo = telephoneNo;
        System.out.println("Congratulations " + customerName + " You have been successfully registered for our services with the following details:");
        System.out.println("Pan card number : " + panCardNo);
        System.out.println("Voter id : " + voterId);
        System.out.println("Phone numbers : " + telephoneNo[0] + "\n" + telephoneNo[1]);
    }

    
    
    public static void main(String[] args) {
        System.out.println("Welcome to Enigma internet service");
        System.out.println("Please enter your details below");

        String name = Methods1.getCustomerName();

        boolean status = Methods1.checkPass();

        if(status){
            String passport = Methods1.getPassportNo();
            long[] telephone = Methods1.getTelephoneNo();
            Registration user = new Registration(name, passport, telephone);
        }
        else{
            System.out.println("Please provide any one of the following combinations : ");
            System.out.println("1. License number and pan card number.");
            System.out.println("2. Voter id and license number.");
            System.out.println("3. Pan card and voter id.");
            System.out.println("Enter your choice : ");
            int choice = input.nextInt();
            int license;
            int voterid;
            long[] telephone;
            String pancard;
            switch(choice){
                case 1:
                    license = Methods1.getLicenseNo();
                    pancard = Methods1.getPanCardNo();
                    telephone = Methods1.getTelephoneNo();
                    Registration user = new Registration(name, license, pancard, telephone);
                    break;
                case 2:
                    voterid = Methods1.getVoterId();
                    license = Methods1.getLicenseNo();
                    telephone = Methods1.getTelephoneNo();
                    Registration user2 = new Registration(name, voterid, license, telephone);
                    break;
                case 3:
                    pancard = Methods1.getPanCardNo();
                    voterid = Methods1.getVoterId();
                    telephone = Methods1.getTelephoneNo();
                    Registration user3 = new Registration(name, pancard, voterid, telephone);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            
        }
    }

}
