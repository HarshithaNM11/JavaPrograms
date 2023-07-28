class BadmintonKiller{
	
	public static void main(String[] values)
	{
	System.out.println("running main in BadmintonKiller");
	Badminton badminton=new Badminton();
	System.out.println(badminton.color);
	System.out.println(badminton.brand);
	System.out.println(badminton.price);
	System.out.println(badminton.noOfbats);
	System.out.println(badminton.noOfRockets);
	badminton.color="black";
	badminton.brand="apacs";
	badminton.price=350.4;
	badminton.noOfbats=2;
	badminton.noOfRockets=1;
	System.out.println(badminton.color);
	System.out.println(badminton.brand);
	System.out.println(badminton.price);
	System.out.println(badminton.noOfbats);
	System.out.println(badminton.noOfRockets);
	System.out.println("-------------------------------------");
	
	Badminton badminton1=new Badminton();
	System.out.println(badminton1.color);
	System.out.println(badminton1.brand);
	System.out.println(badminton1.price);
	System.out.println(badminton1.noOfbats);
	System.out.println(badminton1.noOfRockets);
	badminton1.color="black";
	badminton1.brand="yonex";
	badminton1.price=400;
	badminton1.noOfbats=4;
	badminton1.noOfRockets=1;
	System.out.println(badminton1.color);
	System.out.println(badminton1.brand);
	System.out.println(badminton1.price);
	System.out.println(badminton1.noOfbats);
	System.out.println(badminton1.noOfRockets);
	
	}
	
}