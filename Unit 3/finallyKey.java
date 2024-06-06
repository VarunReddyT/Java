import java.io.*;

public class finallyKey {
    public static void main(String[] args) throws IOException{
        File f = new File("employee.csv");
        FileReader f1 = new FileReader(f);
        int data;
        try{
            while ((data = f1.read()) != -1) {
                System.out.print((char)data);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            f1.close();
            System.out.println("\nFile Closed");
        }
    }
}
