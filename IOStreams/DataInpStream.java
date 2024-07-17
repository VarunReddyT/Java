import java.io.*;

class DataInpStream {
    public static void main(String[] args) throws IOException {
        int x;
        FileInputStream fis = new FileInputStream("write2.txt");
        DataInputStream dis = new DataInputStream(fis);
        for (int i = 0; i < 5; i++) {
            x = dis.readInt();
            System.out.println(x);
        }
        dis.close();
    }
}