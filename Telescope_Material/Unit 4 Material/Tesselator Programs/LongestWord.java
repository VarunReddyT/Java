/*Write a java program to find longest word in the sentence using PriorityQueue 
(Java collection framework)

sample:
input=
welcome to keshav memorial institute of technology
output=
technology 

*/




import java.util.*;
class LongestWord
{
    void find()
    {
        MyComparator myc=new MyComparator();
        PriorityQueue<String> pq = new PriorityQueue<String>(myc);
        Scanner scan = new Scanner(System.in);
        String sen = scan.nextLine();
        String[] arr = sen.split(" ");
        for(int i =0;i<arr.length;i++)
        {
            pq.add(arr[i]);
        }
        System.out.println(pq.peek());   
    }
	public static void main(String[] args)
	{
		LongestWord l=new LongestWord();
		l.find();
	}
}

class MyComparator implements Comparator<String>
{
    public int compare(String s1, String s2) //descending comparator
    {
        if(s1.length()< s2.length())
        {
            return 1;
        }
        else if(s1.length()==s2.length())
        {
            return 0;
        }
        else
        {
            return -1;
        }
    }
}

/*test cases
case=1
input=keshav memorial institute of Technology
output=Technology

case=2
input=Dear students prepare well for ur examinations
output=examinations

*/