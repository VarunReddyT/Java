import java.util.*;
class PhnoComparator implements Comparator<Subscriber>
{
	public int compare(Subscriber s1,Subscriber s2)
	{
		if(s1.phno<s2.phno)
			return -1;
		else if(s1.phno==s2.phno)
			return 0;
		else 	
			return 1;
	}
}


