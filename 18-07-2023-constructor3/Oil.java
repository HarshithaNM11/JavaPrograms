class Oil{
	String name;
	double viscosity;
	int quantity;
	
	Oil(){
		System.out.println("Invoking No-arguments in Oil");
		System.out.println("Oil name  in Constructor:"+this.name);
		System.out.println("Oil viscosity in Constructor:"+this.viscosity);
		System.out.println("Oil quantity in Constructor:"+this.quantity);
	}
	Oil(String name){
		System.out.println("Invoking string argument in Oil");
		this.name=name;
		this.viscosity=viscosity;
		this.quantity=quantity;
	}
	Oil(String name,double viscosity){
		System.out.println("Invoking String,double in Oil");
		this.name=name;
		this.viscosity=viscosity;
		this.quantity=quantity;
	}
	Oil(String name,int quantity,double viscosity){
		System.out.println("Invoking String,double,int in Oil");
		this.name=name;
		this.viscosity=viscosity;
		this.quantity=quantity;
	}
}