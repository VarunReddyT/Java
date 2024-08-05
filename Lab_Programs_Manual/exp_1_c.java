// c. Cricketer's Pension Continuing our journey in mastering the conditional statements & our interest with
// cricket.
// Let us help the Indian cricket's governing body (BCCI) to automate its plan of allotting pensions to
// former players.
// The rules are given below:
// If a player has played more than 10 test matches and 100 ODI's he receives Rs.50,000.
// If a player has played more than 10 test matches he receives Rs.25,000.
// If a player has played more than 100 ODI's he receives Rs.15,000.
// If a player has played for India he receives Rs.10,000.
// The amount is incremented by 1/4th for every 'man of the match' award.
// If a player has not played for India but played IPL he receives an amount of Rs.8,000.
// If a player has not played for India nor IPL he receives an amount of Rs.7,000.

import java.util.*;

public class exp_1_c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Has he played for India? y for yes and n for no");
        char c1 = sc.next().charAt(0);
        System.out.println("Has he played for IPL? y for yes and n for no");
        char c2 = sc.next().charAt(0);
        double amount = 0;

        if(c1 == 'y'){
            System.out.println("Enter no. of Test Matches played : ");
            int testM = sc.nextInt();
            System.out.println("Enter no. of ODI's played : ");
            int odiM = sc.nextInt();
            System.out.println("Enter no. of Man of the Match award(s) : ");
            int manM = sc.nextInt();

            if(testM > 10 && odiM > 100){
                amount += 50000;
            }
            else if(testM > 10){
                amount += 25000;
            }
            else if(odiM > 100){
                amount += 15000;
            }
            else{
                amount += 10000;
            }
            amount += 0.25*manM;
            System.out.println("Pension : " + amount);
        }
        else if(c2 == 'y'){
            System.out.println("Enter no. of Man of the Match award(s) : ");
            int manM = sc.nextInt();
            amount += 8000;
            amount += 0.25*manM;
            System.out.println("Pension : " + amount);
        }
        else{
            amount += 7000;
            System.out.println("Pension : " + amount);
        }
        sc.close();
    }    
}
