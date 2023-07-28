class FlightNames{
	public static void main(String[] args)
	{
		String airIndia="Air India";
		String indiGo="IndiGo";
		String spiceJet="SpiceJet";
		String goAir="GoAir";
		String vistara="Vistara";6666666666666666
		String airAsiaIndia="AirAsia India";
		String jetAirways ="Jet Airways";
		String airIndiaExpress="Air India Express";
		
		String[] flights={airIndia,indiGo,spiceJet,goAir,vistara,airAsiaIndia,jetAirways,airIndiaExpress};
		System.out.println(".....Printing forward order.....");
		
		for(int index=0;index<flights.length;index++)
		{
			System.out.println("Grocery at index "+index+ " is " +flights[index]);
		}
		
		System.out.println("\n");
		
		
		System.out.println(".....Updating the array values.....");
		
		flights[4]="Alliance Air";
		flights[6]="TruJet";
		
		System.out.println("\n");
		
		System.out.println(".....Printing backward order.....");
		
		for(int index=flights.length-1;index>=0;index--)
		{
			System.out.println("Grocery at index "+index+ " is " +flights[index]);
		}
		
		
	}
}