import java.io.*;
public class OutputFile16{
    public static void main(String[] args) throws IOException {
        File f = new File("sample1.txt");
        f.createNewFile();
        FileOutputStream fos = new FileOutputStream(f);
        fos.write("Hello Deepak".getBytes());
        fos.close();
    }

}
