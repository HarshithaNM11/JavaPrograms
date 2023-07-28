class MetroKiller{
	
	public static void main(String[] values)
	{
	System.out.println("running main in BadmintonKiller");
	Metro metro=new Metro();
	System.out.println(metro.line);
	System.out.println(metro.locationFrom);
	System.out.println(metro.locationTo);
	System.out.println(metro.price);
	System.out.println(metro.noOfPassangers);
	metro.line="Green line";
	metro.locationFrom="Vijayanagar";
	metro.locationTo="Majestic";
	metro.price=28;
	metro.noOfPassangers=100;
	System.out.println(metro.line);
	System.out.println(metro.locationFrom);
	System.out.println(metro.locationTo);
	System.out.println(metro.price);
	System.out.println(metro.noOfPassangers);
	System.out.println("-------------------------------------");
	
	Metro metro1=new Metro();
	System.out.println(metro1.line);
	System.out.println(metro1.locationFrom);
	System.out.println(metro1.locationTo);
	System.out.println(metro1.price);
	System.out.println(metro1.noOfPassangers);
	metro1.line="Blue line";
	metro1.locationFrom="Kengeri";
	metro1.locationTo="Majestic";
	metro1.price=45;
	metro1.noOfPassangers=500;
	System.out.println(metro1.line);
	System.out.println(metro1.locationFrom);
	System.out.println(metro1.locationTo);
	System.out.println(metro1.price);
	System.out.println(metro1.noOfPassangers);
	
	
	
	}
	
}