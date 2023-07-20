class OilKiller{
	public static void main(String[] args){
		System.out.println("Running main in OilKiller");
		
		Oil oil=new Oil();
		System.out.println("Oil name in main:"+oil.name);
		System.out.println("Oil viscosity in main:"+oil.viscosity);
		System.out.println("Oil quantity in main:"+oil.quantity);
		
		System.out.println("##############################");
		
		Oil oil1=new Oil("Sunflower");
		System.out.println("Oil name in main:"+oil1.name);
		System.out.println("Oil viscosity in main:"+oil1.viscosity);
		System.out.println("Oil quantity in main:"+oil1.quantity);

		System.out.println("##############################");
		
		Oil oil2=new Oil("Sunflower",50);
		System.out.println("Oil name in main:"+oil2.name);
		System.out.println("Oil viscosity in main:"+oil2.viscosity);
		System.out.println("Oil quantity in main:"+oil2.quantity);
		
		System.out.println("##############################");
		
		Oil oil3=new Oil("Sunflower",160,50);
		System.out.println("Oil name in main:"+oil3.name);
		System.out.println("Oil viscosity in main:"+oil3.viscosity);
		System.out.println("Oil quantity in main:"+oil3.quantity);
	}
	
}