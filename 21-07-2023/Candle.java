class Candle{
	static String use;
	static String material;
	double price;
	String color;
	
	
	Candle(String color,double price)
	{
		System.out.println("Invoking String,double constructor of Candle");
		this.color=color;
		this.price=price;
	}
	
	static{
		use="Lighting";
		material="Wax";
	}
	
	static void printStatic()
	{
		System.out.println("Invoking printstatic in Candle");
		System.out.println("Candle use :"+use);
		System.out.println("Candle material :"+material);
	}
	
	void printInstance()
	{
		System.out.println("Invoking printInstance in Candle");
		System.out.println("Candle color :"+color);
		System.out.println("Candle price :"+price);
	}
}