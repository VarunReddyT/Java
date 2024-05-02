import java.io.*;
public class ReadFile17 {
    public static void main(String[] args) throws IOException{
        FileReader f = new FileReader("sample.txt");
        int data;
        while((data = f.read()) != -1){
            System.out.println((char)data);
        }
        f.close();
    }
}
