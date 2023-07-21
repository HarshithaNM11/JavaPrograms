class CricketKiller{
	public static void main(String[] args)
	{
		System.out.println("Invoking main in cricketKiller");
		Cricket cricket=new Cricket();
		System.out.println("---------------------------");
		
		Cricket cricket1=new Cricket(11,"chinnaswamy","Rohit");
		System.out.println(cricket1.noOfPlayers);
		System.out.println(cricket1.stadiumName);
		System.out.println(cricket1.name);
		
	}
	
}