import java.util.*;
class AgeComparator implements Comparator<Subscriber>
{
	public int compare(Subscriber s1,Subscriber s2)
	{
		return s1.age.compareTo(s2.age);
	}
}
