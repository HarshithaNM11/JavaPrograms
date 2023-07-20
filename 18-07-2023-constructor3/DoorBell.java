class DoorBell{
	String type;
	int sizeInGms;
	double cost;
	int netQuantity;
	String modelNum;
	String countryOfOrigin;
	String manufacturer;
	
	DoorBell(){
		System.out.println("Invoking No-arguments in DoorBell");
		System.out.println("DoorBell type  in Constructor:"+this.type);
		System.out.println("DoorBell sizeInGms in Constructor:"+this.sizeInGms);
		System.out.println("DoorBell cost in Constructor:"+this.cost);
		System.out.println("DoorBell netQuantity  in Constructor:"+this.netQuantity);
		System.out.println("DoorBell modelNum in Constructor:"+this.modelNum);
		System.out.println("DoorBell countryOfOrigin  in Constructor:"+this.countryOfOrigin);
		System.out.println("DoorBell manufacturer in Constructor:"+this.manufacturer);
	}
	DoorBell(String type){
		System.out.println("Invoking string argument in DoorBell");
		this.type=type;
		this.sizeInGms=sizeInGms;
		this.cost=cost;
		this.netQuantity=netQuantity;
		this.modelNum=modelNum;
		this.countryOfOrigin=countryOfOrigin;
		this.manufacturer=manufacturer;
	}
	DoorBell(String type,int sizeInGms,double cost){
		System.out.println("Invoking string,int ,double argument in DoorBell");
		this.type=type;
		this.sizeInGms=sizeInGms;
		this.cost=cost;
		this.netQuantity=netQuantity;
		this.modelNum=modelNum;
		this.countryOfOrigin=countryOfOrigin;
		this.manufacturer=manufacturer;
	}
	DoorBell(String type,int sizeInGms,double cost,int netQuantity){
		System.out.println("Invoking string,int,double argument in DoorBell");
		this.type=type;
		this.sizeInGms=sizeInGms;
		this.cost=cost;
		this.netQuantity=netQuantity;
		this.modelNum=modelNum;
		this.countryOfOrigin=countryOfOrigin;
		this.manufacturer=manufacturer;
	}
	DoorBell(String type,int sizeInGms,double cost,int netQuantity,String modelNum){
		System.out.println("Invoking string,int ,double argument in DoorBell");
		this.type=type;
		this.sizeInGms=sizeInGms;
		this.cost=cost;
		this.netQuantity=netQuantity;
		this.modelNum=modelNum;
		this.countryOfOrigin=countryOfOrigin;
		this.manufacturer=manufacturer;
	}
	DoorBell(String type,int sizeInGms,double cost,int netQuantity,String modelNum,String countryOfOrigin){
		System.out.println("Invoking string, int ,double argument in DoorBell");
		this.type=type;
		this.sizeInGms=sizeInGms;
		this.cost=cost;
		this.netQuantity=netQuantity;
		this.modelNum=modelNum;
		this.countryOfOrigin=countryOfOrigin;
		this.manufacturer=manufacturer;
	}
	DoorBell(String type,int sizeInGms,double cost,int netQuantity,String modelNum,String countryOfOrigin,String manufacturer){
		System.out.println("Invoking string , int ,doubleargument in DoorBell");
		this.type=type;
		this.sizeInGms=sizeInGms;
		this.cost=cost;
		this.netQuantity=netQuantity;
		this.modelNum=modelNum;
		this.countryOfOrigin=countryOfOrigin;
		this.manufacturer=manufacturer;
	}
}