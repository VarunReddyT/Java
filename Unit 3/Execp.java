import java.io.*;
public class Execp {
    public static void main(String[] args) {
        File f = new File("marks.txt");
        try{
            FileInputStream d = new FileInputStream(f);
        }
        catch(Exception e ){
            System.out.println(e);
            throw new ArithmeticException();
        }
    }
}
