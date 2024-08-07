import java.util.*;
public class MySquare extends MyRectangle {
    public int xcor;
    public int ycor;
    public int length;
    public MySquare(int xcord, int ycord, int leng){
        super(xcord,ycord,xcord+leng,ycord+leng);
        this.length = leng;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int len = sc.nextInt();

        MySquare square = new MySquare(x, y, len);
        System.out.println(square.area());
        sc.close();
    }
}
