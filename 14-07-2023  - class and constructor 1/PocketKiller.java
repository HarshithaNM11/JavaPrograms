class PocketKiller{
	
	public static void main(String[] values)
	{
	System.out.println("running main in PocketKiller");
	Pocket pocket=new Pocket();
	System.out.println(pocket.design);
	System.out.println(pocket.size);
	System.out.println(pocket.shape);
	System.out.println(pocket.noOfPockets);
	System.out.println(pocket.pattern);
	pocket.design="square";
	pocket.size="small";
	pocket.shape="round";
	pocket.noOfPockets=3;
	pocket.pattern="single";
	System.out.println(pocket.design);
	System.out.println(pocket.size);
	System.out.println(pocket.shape);
	System.out.println(pocket.noOfPockets);
	System.out.println(pocket.pattern);
	System.out.println("-------------------------------------");
	
	System.out.println("running main in PocketKiller");
	Pocket pocket1=new Pocket();
	System.out.println(pocket1.design);
	System.out.println(pocket1.size);
	System.out.println(pocket1.shape);
	System.out.println(pocket1.noOfPockets);
	System.out.println(pocket1.pattern);
	pocket1.design="round";
	pocket1.size="medium";
	pocket1.shape="square";
	pocket1.noOfPockets=2;
	pocket1.pattern="single";
	System.out.println(pocket1.design);
	System.out.println(pocket1.size);
	System.out.println(pocket1.shape);
	System.out.println(pocket1.noOfPockets);
	System.out.println(pocket1.pattern);
	
	
	}
	
}