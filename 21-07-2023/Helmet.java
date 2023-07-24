class Helmet{
	static String brand;
	static String size;
	double price;
	String color;
	String material;
	
	Helmet(String color,double price,String material)
	{
		System.out.println("Invoking String,double,String constructor of Helmet");
		this.color=color;
		this.price=price;
		this.material=material;
	}
	
	static{
		brand="Vega breeze";
		size="M(Full face)";
	}
	
	static void printStatic()
	{
		System.out.println("Invoking printstatic in Helmet");
		System.out.println("Helmet brand :"+brand);
		System.out.println("Helmet size :"+size);
	}
	
	void printInstance()
	{
		System.out.println("Invoking printInstance in Helmet");
		System.out.println("Helmet color :"+color);
		System.out.println("Helmet price :"+price);
		System.out.println("Material used for Helmet :"+material);
	}
}