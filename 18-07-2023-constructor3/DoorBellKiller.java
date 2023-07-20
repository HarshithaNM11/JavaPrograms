class DoorBellKiller{
	public static void main(String[] args){
		System.out.println("Running main in DoorBellKiller");
		
		DoorBell doorBell=new DoorBell();
		System.out.println("DoorBell type in main:"+doorBell.type);
		System.out.println("DoorBell sizeInGms in main:"+doorBell.sizeInGms);
		System.out.println("DoorBell cost in main:"+doorBell.cost);
		System.out.println("DoorBell  netQuantity in main:"+doorBell.netQuantity);
		System.out.println("DoorBell modelNum in main:"+doorBell.modelNum);
		System.out.println("DoorBell cost in main:"+doorBell.countryOfOrigin);
		System.out.println("DoorBell manufacturerin main:"+doorBell.manufacturer);
		
		System.out.println("##############################");
		
		DoorBell doorBell1=new DoorBell("Wireless");
		System.out.println("DoorBell type in main:"+doorBell1.type);
		System.out.println("DoorBell sizeInGms in main:"+doorBell1.sizeInGms);
		System.out.println("DoorBell cost in main:"+doorBell1.cost);
		System.out.println("DoorBell  netQuantity in main:"+doorBell1.netQuantity);
		System.out.println("DoorBell modelNum in main:"+doorBell1.modelNum);
		System.out.println("DoorBell cost in main:"+doorBell1.countryOfOrigin);
		System.out.println("DoorBell manufacturerin main:"+doorBell1.manufacturer);

		System.out.println("##############################");
		
		DoorBell doorBell2=new DoorBell("Smart",150,980);
		System.out.println("DoorBell type in main:"+doorBell2.type);
		System.out.println("DoorBell sizeInGms in main:"+doorBell2.sizeInGms);
		System.out.println("DoorBell cost in main:"+doorBell2.cost);
		System.out.println("DoorBell  netQuantity in main:"+doorBell2.netQuantity);
		System.out.println("DoorBell modelNum in main:"+doorBell2.modelNum);
		System.out.println("DoorBell cost in main:"+doorBell2.countryOfOrigin);
		System.out.println("DoorBell manufacturerin main:"+doorBell2.manufacturer);
		
		System.out.println("##############################");
		
		DoorBell doorBell3=new DoorBell("Wired",120,560,1);
		System.out.println("DoorBell type in main:"+doorBell3.type);
		System.out.println("DoorBell sizeInGms in main:"+doorBell3.sizeInGms);
		System.out.println("DoorBell cost in main:"+doorBell3.cost);
		System.out.println("DoorBell  netQuantity in main:"+doorBell3.netQuantity);
		System.out.println("DoorBell modelNum in main:"+doorBell3.modelNum);
		System.out.println("DoorBell cost in main:"+doorBell3.countryOfOrigin);
		System.out.println("DoorBell manufacturerin main:"+doorBell3.manufacturer);
		
		System.out.println("##############################");
		
		DoorBell doorBell4=new DoorBell("Wireless",150,850,1,"Active black");
		System.out.println("DoorBell type in main:"+doorBell4.type);
		System.out.println("DoorBell sizeInGms in main:"+doorBell4.sizeInGms);
		System.out.println("DoorBell cost in main:"+doorBell4.cost);
		System.out.println("DoorBell  netQuantity in main:"+doorBell4.netQuantity);
		System.out.println("DoorBell modelNum in main:"+doorBell4.modelNum);
		System.out.println("DoorBell cost in main:"+doorBell4.countryOfOrigin);
		System.out.println("DoorBell manufacturerin main:"+doorBell4.manufacturer);
		
		System.out.println("##############################");
		
		DoorBell doorBell5=new DoorBell("Wireless",150,850,1,"Active black","India");
		System.out.println("DoorBell type in main:"+doorBell5.type);
		System.out.println("DoorBell sizeInGms in main:"+doorBell5.sizeInGms);
		System.out.println("DoorBell cost in main:"+doorBell5.cost);
		System.out.println("DoorBell  netQuantity in main:"+doorBell5.netQuantity);
		System.out.println("DoorBell modelNum in main:"+doorBell5.modelNum);
		System.out.println("DoorBell cost in main:"+doorBell5.countryOfOrigin);
		System.out.println("DoorBell manufacturerin main:"+doorBell5.manufacturer);
		
		System.out.println("##############################");
		
		DoorBell doorBell6=new DoorBell("Wireless",150,850,1,"Active black","India","Robot Technology");
		System.out.println("DoorBell type in main:"+doorBell6.type);
		System.out.println("DoorBell sizeInGms in main:"+doorBell6.sizeInGms);
		System.out.println("DoorBell cost in main:"+doorBell6.cost);
		System.out.println("DoorBell  netQuantity in main:"+doorBell6.netQuantity);
		System.out.println("DoorBell modelNum in main:"+doorBell6.modelNum);
		System.out.println("DoorBell cost in main:"+doorBell6.countryOfOrigin);
		System.out.println("DoorBell manufacturerin main:"+doorBell6.manufacturer);
	}
	
}