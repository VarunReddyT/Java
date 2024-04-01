

// Current Account:
// A current account is primarily used by businesses, companies, and individuals for managing day-to-day financial transactions.
// It typically offers features such as unlimited transactions, overdraft facilities, checkbook facilities, and online banking services.
// Current accounts usually do not pay any interest on the deposited amount.
// These accounts may require a higher minimum balance to be maintained compared to savings accounts.
// They are suited for frequent transactions, payments, and withdrawals.
import java.util.Scanner;

public class currentBank {
    private currentAccount obj;

    currentBank(currentAccount obj) {
        this.obj = obj;
    }

    public void operate(Scanner scanner) {
        int choice;
        while (true) {
            System.out.println("Enter 1 to withdraw, 2 to deposit, 3 to check balance, 4 to check transactions, 5 to transfer, 6 to apply for checkbook, \n7 to apply for debit card, 8 to apply for online banking, 9 to enable overdraft facilities, 10 to exit");
            choice = scanner.nextInt();
            float amount = 0;
            switch (choice) {
                case 1:
                    System.out.println("Enter amount to withdraw");
                    amount = scanner.nextFloat();
                    obj.withdraw(amount);
                    break;
                case 2:
                    System.out.println("Enter amount to deposit");
                    amount = scanner.nextFloat();
                    obj.deposit(amount);
                    break;
                case 3:
                    System.out.println(obj.getBalance());
                    break;
                case 4:
                    System.out.println(obj.getTransactions());
                    break;
                case 5:
                    System.out.println("Enter amount to transfer");
                    amount = scanner.nextFloat();
                    currentAccount b = new currentAccount(123, "Bob", 15000, 15, 34000, scanner);
                    obj.transfer(b, amount);
                    break;
                case 6:
                    obj.checkbook();
                    break;
                case 7:
                    obj.debitCard();
                    break;
                case 8:
                    obj.onlineBanking();
                    break;
                case 9:
                    obj.overdraft();
                    break;
                case 10:
                    return;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
