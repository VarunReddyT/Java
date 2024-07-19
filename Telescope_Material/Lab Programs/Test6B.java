/*
You have created a web-based survey of favorite programming languages and are capturing the results into a text file named logfile".
The logfile is ordered by increasing timestamp. You are concerned that some people are voting multiple times for the same item. To somewhat address this problem, throw out any new votes for the same item that come from the same IP address within 20 seconds.
In the above example, the second and last votes for PHP would be thrown out because they are for the same item from the same IP address and occur within 20 seconds of other PHP votes from the same IP address. However, the PHP vote from 128.120.56.214 would be retained since there is not another PHP vote from this IP address.
Write a Java program to count the votes from the logfile, throwing out duplicate votes using the rules above. Display the votes in a table, as shown below for the example:

PHP 2 
C# 1
Prolog 1

*/
import java.util.*; 
import java.io.*;
class Data
{  
	String plang,ip,timestamp; 
	Data(String plang,String ip,String timestamp)
	{
		this.plang=plang;
		this.ip=ip;
		this.timestamp=timestamp;
	} 
} 
public class Test6B 
{ 
	public static void main(String[] args) throws Exception 
	{ 
		Scanner sc = new Scanner(System.in); 
		FileReader fr = new FileReader("logfile.txt"); 
		BufferedReader br=new BufferedReader(fr); 
		String line;
		String[] data;
		ArrayList<Data> al=new ArrayList<Data>();
		while((line=br.readLine())!=null) 
		{
			data= line.split("\t");
			Data d=new Data(data[0],data[1],data[2]);
			al.add(d);
		}
		for(Data d : al)
		{
			System.out.println(d.plang+","+d.ip+","+d.timestamp);
		}
		int t1,t2,i,j,n = al.size();
		for(i=0;i<n-1;i++)
		{
		for (j=i+1;j<n;j++) 
		{
			if (al.get(i).plang.equals(al.get(j).plang) && al.get(i).ip.equals(al.get(j).ip))
			{
				t1 = Integer.parseInt(al.get(i).timestamp);
				t2 = Integer.parseInt(al.get(j).timestamp);
				if(t2-t1 <=20)
				{
					al.remove(j);
					n=n-1;
				}
			}
		}
		}
		HashMap<String,Integer> votes=new HashMap<>();
		for(Data d: al)
		{
			int x = votes.getOrDefault(d.plang,0)+1;
			votes.put(d.plang,x);
		}
		Set<String> keys=votes.keySet();
		for(String k:keys)
			System.out.println(k+" "+votes.get(k));
		
		/*Set<Map.Entry<String,Integer>> s1=votes.entrySet();
		for (Map.Entry e : s1) 
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}*/
	} 
}
