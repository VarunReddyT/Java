
import java.util.Scanner;

public class bank4 {
    public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		account4 a = new account4(96184,"Varun Reddy",0,0);
		account4 b = new account4(96185,"KMIT",0,0);
		a.welcome();
		boolean flag = true;
		while(flag){
			System.out.println("Enter 1 for deposit, 2 for withdraw, 3 to check balance, 4 to check number of transactions, 5 to transfer, 6 to exit");
			int choice = obj.nextInt();
			switch(choice){
				case 1:
					System.out.println("Enter the deposit amount : ");
					float depositAmt = obj.nextFloat();
					a.deposit(depositAmt);
					break;
				case 2:
					System.out.println("Enter the withdraw amount : ");
					float withdrawAmt = obj.nextFloat();
					a.withdraw(withdrawAmt);
					break;
				case 3:
					System.out.println(a.getbalance());
					break;
				case 4:
					System.out.print("Number of transactions are : ");
					System.out.println(a.getTransacions());
					break;
				case 5:
					System.out.print("Enter the amount to transfer : ");
					float transferAmt = obj.nextFloat();
					a.transfer(b,transferAmt);
					break;
				case 6:
					flag = false;
					break;
				default:
					System.out.println("Enter valid choice");
					break;
			}
		}

		obj.close();
	}
}
