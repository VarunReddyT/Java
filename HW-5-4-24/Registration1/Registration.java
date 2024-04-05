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

    Registration(String customerName, String passportNo, long[] telephoneNo){
        this.customerName = customerName;
        this.passportNo = passportNo;
        this.telephoneNo = telephoneNo;
        System.out.println("Congratulations " + getCustomerName() + "!!! you have been successfully registered for our services with the following details:");
        System.out.println("Passport number : " + getPassportNo());
        System.out.println("Phone numbers : " + getTelephoneNo()[0] + "\n" + getTelephoneNo()[1]);
        System.out.println();
    }
    Registration(String customerName, int licenseNo, String panCardNo,long[] telephoneNo ){
        this.customerName = customerName;
        this.licenseNo = licenseNo;
        this.panCardNo = panCardNo;
        this.telephoneNo = telephoneNo;
        System.out.println("Congratulations " + getCustomerName() + "!!! you have been successfully registered for our services with the following details:");
        System.out.println("License number : " + getLicenseNo());
        System.out.println("Pan card number : " + getPanCardNo());
        System.out.println("Phone numbers : " + getTelephoneNo()[0] + "\n" + getTelephoneNo()[1]);
        System.out.println();
    }
    Registration(String customerName, int voterId, int licenseNo, long[] telephoneNo){
        this.customerName = customerName;
        this.voterId = voterId;
        this.licenseNo = licenseNo;
        this.telephoneNo = telephoneNo;
        System.out.println("Congratulations " + getCustomerName() + "!!! you have been successfully registered for our services with the following details:");
        System.out.println("Voter id : " + getVoterId());
        System.out.println("License number : " + getLicenseNo());
        System.out.println("Phone numbers : " + getTelephoneNo()[0] + "\n" + getTelephoneNo()[1]);
        System.out.println();
    }
    Registration(String customerName, String panCardNo, int voterId, long[] telephoneNo){
        this.customerName = customerName;
        this.panCardNo = panCardNo;
        this.voterId = voterId;
        this.telephoneNo = telephoneNo;
        System.out.println("Congratulations " + getCustomerName() + "!!! you have been successfully registered for our services with the following details:");
        System.out.println("Pan card number : " + getPanCardNo());
        System.out.println("Voter id : " + getVoterId());
        System.out.println("Phone numbers : " + getTelephoneNo()[0] + "\n" + getTelephoneNo()[1]);
        System.out.println();
    }

    public String getCustomerName(){
        return customerName;
    }
    public String getPanCardNo(){
        return panCardNo;
    }
    public int getVoterId(){
        return voterId;
    }
    public String getPassportNo(){
        return passportNo;
    }   
    public int getLicenseNo(){
        return licenseNo;
    }
    public long[] getTelephoneNo(){
        return telephoneNo;
    }

    public static void main(String[] args) {
        Registration r1 = new Registration("Kevin", "MN9891N", new long[]{9452425421L, 7676765252L});

        Registration r2 = new Registration("Julias", 123, "PN7878", new long[]{2345615451L, 6763562562L});

        Registration r3 = new Registration("Jammy", 45453, 765, new long[]{9634524353L, 9887373737L});

        Registration r4 = new Registration("Rose", "PN8934", 34356, new long[]{9867456367L, 7645367356L});
    }

}
