import java.util.Scanner;

public class mainBank {
    private static void welcome() {
        System.out.println("Welcome to the Bank");
    }

    public static void main(String[] args) {
        welcome();
        Scanner scanner = new Scanner(System.in);
        try {
            int choice;
            System.out.println("Enter 1 for Current Account, 2 for Savings Account, 3 to exit");
            choice = scanner.nextInt();
            int accNumber;
            String accHolderName;
            boolean status;
            switch (choice) {
                case 1:
                    System.out.println("Enter Account Number : ");
                    accNumber = scanner.nextInt();
                    System.out.println("Enter Account Holder Name : ");
                    accHolderName = scanner.next();
                    float salary;
                    System.out.println("Enter Salary : ");
                    salary = scanner.nextFloat();
                    currentAccount currentacc = new currentAccount(accNumber, accHolderName, 0, 0, salary,scanner);
                    status = currentacc.start();
                    if (!status) {
                        System.out.println("Account not created");
                        System.exit(0);
                    }
                    currentBank currbank = new currentBank(currentacc);
                    currbank.operate(scanner);
                    break;
                case 2:
                    System.out.println("Enter Account Number : ");
                    accNumber = scanner.nextInt();
                    System.out.println("Enter Account Holder Name : ");
                    accHolderName = scanner.next();
                    savingsAccount savingsacc = new savingsAccount(accNumber, accHolderName, 0, 0, scanner);
                    status = savingsacc.start();
                    if (!status) {
                        System.out.println("Account not created");
                        System.exit(0);
                    }
                    savingsBank savbank = new savingsBank(savingsacc);
                    savbank.operate(scanner);
                    break;
                case 3:
                    System.out.println("Thank you for visiting the bank.");
                    break;
                default:
                    System.out.println("Enter valid choice");
                    break;
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
