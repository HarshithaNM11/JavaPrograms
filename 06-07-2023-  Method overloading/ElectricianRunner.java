class ElectricianRunner{
	public static void main(String [] args)
	{
		System.out.println("Running main in ElectricianRunner");
		
		Electrician.skill();
	    Electrician.skill("Electrician");
		Electrician.measure(12);
		Electrician.measure(12,10);
		Electrician.details("Harshitha ");
		Electrician.contact(9620689808l);
		Electrician.address("Shivamogga");
		Electrician.experience(3);
		
		//calling method inside method i.e repair
		Electrician.frame();
		
	}
}