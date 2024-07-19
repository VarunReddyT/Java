import java.io.IOException;  
import java.io.RandomAccessFile;  
  
public class RandomAccess1 
{  
    private static byte[] readFromFile(String filePath, int position, int size) throws IOException 
    {  
        RandomAccessFile file = new RandomAccessFile(filePath, "r");  
        file.seek(position);  
        byte[] bytes = new byte[size];  
        file.read(bytes);  
        file.close();  
        return bytes;  
    }  
    private static void writeToFile(String filePath, String data, int position)throws IOException 
    {  
        RandomAccessFile file = new RandomAccessFile(filePath, "rw");  
        file.seek(position);  
        file.write(data.getBytes());  
        file.close();  
    }  
    public static void main(String[] args) throws Exception
    {  
        byte b[]=readFromFile("input1.txt", 5, 10);
	    String s=new String(b);
	    System.out.println(s);  
        writeToFile("input1.txt", "I love my country and my people", 31);  
    } 
}  