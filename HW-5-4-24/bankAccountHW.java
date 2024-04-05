// The bank needs a photo identification proof, address proof and minimum amount of 1000 rupees deposit. From the customer to open his account each branch of bank has its own process for validating the address proof and photo identification proof for the customers. The open account process validates the photo identification proof, address proof and minimum balance for opening an account.

abstract class Bank {
    private String photoIdProof;
    private String addressProof;
    private double balance;

    public Bank(String photoIdProof, String addressProof, double balance) {
        this.photoIdProof = photoIdProof;
        this.addressProof = addressProof;
        this.balance = balance;
    }

    abstract boolean validatePhotoIdProof(String photoIdProof);

    abstract boolean validateAddressProof(String addressProof);

    public void openAccount() {
        if (validatePhotoIdProof(photoIdProof) && validateAddressProof(addressProof) && balance >= 1000) {
            System.out.println("Account opened successfully with balance " + balance + " rupees");
        } else {
            System.out.println("Failed to open account. Please provide valid documents or minimum balance.");
        }
    }
}

class BranchA extends Bank {
    public BranchA(String photoIdProof, String addressProof, double balance) {
        super(photoIdProof, addressProof, balance);
    }

    public boolean validatePhotoIdProof(String photoIdProof) {
        if(photoIdProof == "Aadhar Card" || photoIdProof == "Pan Card" || photoIdProof == "Voter ID") {
            return true;
        }
        return false; 
    }

    public boolean validateAddressProof(String addressProof) {
        if(addressProof == "Aadhar Card" || addressProof == "Ration Card" || addressProof == "Passport") {
            return true;
        }
        return false;
    }
}

class BranchB extends Bank {
    public BranchB(String photoIdProof, String addressProof, double balance) {
        super(photoIdProof, addressProof, balance);
    }

    public boolean validatePhotoIdProof(String photoIdProof) {
       if(photoIdProof == "Passport" || photoIdProof == "Pan Card" || photoIdProof == "Voter ID"){
            return true;
       }
        return false; 
    }

    public boolean validateAddressProof(String addressProof) {
        if(addressProof == "Aadhar Card" || addressProof == "Electricity Bill" || addressProof == "Passport") {
            return true;
        }
        return false;
    }
}

public class bankAccountHW {
    public static void main(String[] args) {
        
        Bank branchA = new BranchA("Aadhar Card", "Passport", 1500);
        branchA.openAccount();

        Bank branchB = new BranchB("Passport", "Bank Statement", 1200);
        branchB.openAccount();
    }
}
