class ContractorRunner{
	public static void main(String [] args)
	{
		System.out.println("Running main in Runner");
		
		Contractor.skill();
	    Contractor.skill("plaining");
		Contractor.measure(12);
		Contractor.measure(12,10);
		Contractor.details("Harshitha ");
		Contractor.contact(9620689808l);
		Contractor.address("Shivamogga");
		Contractor.experience(3);
		
		//calling method inside method i.e repair
		Contractor.frame();
		
	}
}