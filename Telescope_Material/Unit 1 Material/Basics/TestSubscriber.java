class TestSubscriber
{
	public static void main(String []args)
	{
		Subscriber s1 = new Subscriber();
		System.out.println("Subscriber 1");
		System.out.println("Age = "+s1.age);
		System.out.println("Name = "+s1.name);
		System.out.println("mdn = "+s1.mdn);
		s1.receiveCall("Keerthi");
		
		System.out.println("\nSubscriber 2");
		Subscriber s2 = new Subscriber(36,"Hima Bindu",1234569870L);
		System.out.format("Age = %d\nName = %s\nmdn = %d\n",s2.age,s2.name,s2.mdn);
		s2.makeCall("Nikitha");
		
	}
}