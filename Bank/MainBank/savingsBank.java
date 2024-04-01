

// A savings account is designed for individuals to save money and earn interest on their deposits.
// It usually has limitations on the number of transactions allowed per month, but it provides interest on the deposited amount.
// Savings accounts often come with features like ATM/debit cards, online banking, and mobile banking facilities.
// They generally have a lower minimum balance requirement compared to current accounts.
// Savings accounts are suitable for individuals who want to save money for short-term or long-term goals while earning interest on their deposits.

import java.util.Scanner;

public class savingsBank {
    private savingsAccount obj;

    savingsBank(savingsAccount obj) {
        this.obj = obj;
    }

    public void operate(Scanner scanner) {
        int choice = 0;
        while (true) {
            System.out.println("Enter 1 to withdraw, 2 to deposit, 3 to check balance, 4 to check transactions, 5 to transfer, 6 to apply for mobile banking, \n7 to apply for debit card, 8 to apply for online banking, 9 to exit");
            if (obj.getTransactions() == 100) {
                System.out.println("Maximum transactions reached");
                break;
            }
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
                    System.out.println("Number of transactions: " + obj.getTransactions());
                    break;
                case 5:
                    System.out.println("Enter amount to transfer");
                    amount = scanner.nextFloat();
                    savingsAccount b = new savingsAccount(123, "Bob", 15000, 15, scanner);
                    obj.transfer(b, amount);
                    break;
                case 6:
                    obj.mobileBanking();
                    break;
                case 7:
                    obj.debitCard();
                    break;
                case 8:
                    obj.onlineBanking();
                    break;
                case 9:
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
