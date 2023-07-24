class Power{
	static String formula;
	static String unit;
	String frequency;
	double voltage;
	
	
	Power(String frequency,double voltage)
	{
		System.out.println("Invoking String,double constructor of Power");
		this.formula=formula;
		this.unit=unit;
	}
	
	static{
		formula="Energy per time";
		unit="Watt";
	}
	
	static void printStatic()
	{
		System.out.println("Invoking printstatic in Power");
		System.out.println("Power formula :"+formula);
		System.out.println("Power unit :"+unit);
	}
	
	void printInstance()
	{
		System.out.println("Invoking printInstance in Power");
		System.out.println("Power frequency :"+frequency);
		System.out.println("Power voltage:"+voltage);
	}
}