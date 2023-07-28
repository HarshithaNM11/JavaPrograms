class StadiumKiller{
	
	public static void main(String[] values)
	{
	System.out.println("running main in StadiumKiller");
	Stadium stadium=new Stadium();
	System.out.println(stadium.name);
	System.out.println(stadium.location);
	System.out.println(stadium.shape);
	System.out.println(stadium.area);
	System.out.println(stadium.type);
	stadium.name="Kantirava";
	stadium.location="Bangalore";
	stadium.shape="round";
	stadium.area= 4;
	stadium.type="outdoor";
	System.out.println(stadium.name);
	System.out.println(stadium.location);
	
	System.out.println(stadium.shape);
	System.out.println(stadium.area);
	System.out.println(stadium.type);
	System.out.println("-------------------------------------");
	
	Stadium stadium1=new Stadium();
	System.out.println(stadium1.name);
	System.out.println(stadium1.location);
	System.out.println(stadium1.shape);
	System.out.println(stadium1.area);
	System.out.println(stadium1.type);
	stadium1.name="Rajiv Gandhi";
	stadium1.location="Delhi";
	stadium1.shape="round";
	stadium1.area= 8;
	stadium1.type="outdoor";
	System.out.println(stadium1.name);
	System.out.println(stadium1.location);
	System.out.println(stadium1.shape);
	System.out.println(stadium1.area);
	System.out.println(stadium1.type);
	
	
	
	
	}
	
}