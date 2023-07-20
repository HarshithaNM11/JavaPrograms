class CarromKiller{
	public static void main(String[] args){
		System.out.println("Running main in CarromKiller");
		
		Carrom carrom=new Carrom();
		System.out.println("Carrom type of game in main:"+carrom.typeOfGame);
		System.out.println("Carrom number of players in main:"+carrom.noOfPlayers);
		System.out.println("Carrom dimension in main:"+carrom.dimension);
		System.out.println("Carrom noOf Coins in main:"+carrom.noOfCoins);
		System.out.println("Carrom type of Carrom in main:"+carrom.typeOfCarrom);
		
		System.out.println("##############################");
		
		Carrom carrom1=new Carrom("Board Game");
		System.out.println("Carrom type of game in main:"+carrom1.typeOfGame);
		System.out.println("Carrom number of players in main:"+carrom1.noOfPlayers);
		System.out.println("Carrom dimension in main:"+carrom1.dimension);
		System.out.println("Carrom noOf Coins in main:"+carrom1.noOfCoins);
		System.out.println("Carrom type of Carrom in main:"+carrom1.typeOfCarrom);

		System.out.println("##############################");
		
		Carrom carrom2=new Carrom("Board Game",160,4);
		System.out.println("Carrom type of game in main:"+carrom2.typeOfGame);
		System.out.println("Carrom number of players in main:"+carrom2.noOfPlayers);
		System.out.println("Carrom dimension in main:"+carrom2.dimension);
		System.out.println("Carrom noOf Coins in main:"+carrom2.noOfCoins);
		System.out.println("Carrom type of Carrom in main:"+carrom2.typeOfCarrom);
		
		System.out.println("##############################");
		
		Carrom carrom3=new Carrom("Board Game",160,4,19);
		System.out.println("Carrom type of game in main:"+carrom3.typeOfGame);
		System.out.println("Carrom number of players in main:"+carrom3.noOfPlayers);
		System.out.println("Carrom dimension in main:"+carrom3.dimension);
		System.out.println("Carrom noOf Coins in main:"+carrom3.noOfCoins);
		System.out.println("Carrom type of Carrom in main:"+carrom3.typeOfCarrom);
		
		System.out.println("##############################");
		
		Carrom carrom4=new Carrom("Sunflower",160,50,19,"Family Carrom");
		System.out.println("Carrom type of game in main:"+carrom4.typeOfGame);
		System.out.println("Carrom number of players in main:"+carrom4.noOfPlayers);
		System.out.println("Carrom dimension in main:"+carrom4.dimension);
		System.out.println("Carrom noOf Coins in main:"+carrom4.noOfCoins);
		System.out.println("Carrom type of Carrom in main:"+carrom4.typeOfCarrom);
	}
	
}