class Contractor{
	
	//overloading method skill
	static void skill()
	{
		System.out.println("Running skill() in Contractor");
	}
	
	static void skill(String name)
	{
		System.out.println("Running skill(String) in Contractor and his name is "+name);
	}
	
	
	//overloading method measure 
	
	static void measure(int length)
	{
		System.out.println("Measuring the length ="+length);
	}
	
	static void measure(int length,int breadth)
	{
		System.out.println("Measuring the length ="+length +"and breadth = "+breadth);
	}
	
	//methods with parameter
	
	static void details(String name)
	{
		System.out.println("The name of the Contractor is "+name);
	}
	
	static void contact(long phoneNumber)
	{
		System.out.println("The contact detail of Contractor is "+phoneNumber);
	}
	
	static void address(String address)
	{
		System.out.println("The address of Contractor is "+address);
	}
	
	static void experience(int exp)
	{
		System.out.println("The experience of Contractor is "+exp);
	}
	
	//method with our wish
	
	static void frame()
	{
		System.out.println("Running frame in Contractor");
		
		//calling method inside a method.
		repair();
	}
	
	static void repair()
	{
		System.out.println("Running repair in Contractor");
	}
	
	
}