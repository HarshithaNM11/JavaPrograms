class FabricRunner{
	public static void main(String[] args){
		System.out.println("running main in FabricRunner");
		
		int price1=Fabric.getPrice("Cotton");
		System.out.println("Price 1 is:"+price1);
		
		int price2=Fabric.getPrice("Nylon");
		System.out.println("Price 2 is:"+price2);
		
		int price3=Fabric.getPrice("Woolen");
		System.out.println("Price 3 is:"+price3);
		
		int price4=Fabric.getPrice("Linen");
		System.out.println("Price 4 is:"+price4);
		
		int price5=Fabric.getPrice("Polyster");
		System.out.println("Price 5 is:"+price5);
		
		int price6=Fabric.getPrice("Silk");
		System.out.println("Price 6 is:"+price6);
		
		
	}
}