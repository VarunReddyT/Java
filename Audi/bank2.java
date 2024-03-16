import java.util.Scanner;

public class bank2{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		account2 a = new account2(96184,"Varun Reddy",0);
		a.welcome();

		System.out.println("Enter the deposit amount : ");
		float depositAmt = obj.nextFloat();
		a.deposit(depositAmt);
		System.out.println(a.getbalance());
		System.out.println("Enter the withdraw amount : ");
		float withdrawAmt = obj.nextFloat();
		a.withdraw(withdrawAmt);
		System.out.println(a.getbalance());

		obj.close();
	}
}
