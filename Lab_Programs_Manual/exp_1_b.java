import java.util.Scanner;

public class exp_1_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        int l = s1.length();
        String s2 = s1.charAt(0)+""+s1.charAt(l-1);
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        if(l<3){
            System.out.println("No");
        }
        else{
            if(n1%n2 == 0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        sc.close();
    }
}
