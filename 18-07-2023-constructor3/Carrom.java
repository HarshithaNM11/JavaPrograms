class Carrom{
	String typeOfGame;
	int noOfPlayers;
	double dimension;
	int noOfCoins;
	String typeOfCarrom;
	
	Carrom(){
		System.out.println("Invoking No-arguments in Carrom");
		System.out.println("Carrom typeOfGame  in Constructor:"+this.typeOfGame);
		System.out.println("Carrom noOfPlayers in Constructor:"+this.noOfPlayers);
		System.out.println("Carrom dimension in Constructor:"+this.dimension);
		System.out.println("Carrom noOfCoins  in Constructor:"+this.noOfCoins);
		System.out.println("Carrom typeOfCarrom in Constructor:"+this.typeOfCarrom);
	}
	Carrom(String typeOfGame){
		System.out.println("Invoking string argument in Carrom");
		this.typeOfGame=typeOfGame;
		this.noOfPlayers=noOfPlayers;
		this.dimension=dimension;
		this.noOfCoins=noOfCoins;
		this.typeOfCarrom=typeOfCarrom;
	}
	Carrom(String typeOfGame,double dimension,int noOfPlayers){
		System.out.println("Invoking String,double,int in Carrom");
		this.typeOfGame=typeOfGame;
		this.noOfPlayers=noOfPlayers;
		this.dimension=dimension;
		this.noOfCoins=noOfCoins;
		this.typeOfCarrom=typeOfCarrom;
	}
	Carrom(String typeOfGame,double dimension,int noOfPlayers,int noOfCoins){
		System.out.println("Invoking String,double,int in Carrom");
		this.typeOfGame=typeOfGame;
		this.noOfPlayers=noOfPlayers;
		this.dimension=dimension;
		this.noOfCoins=noOfCoins;
		this.typeOfCarrom=typeOfCarrom;
	}
	Carrom(String typeOfGame,double dimension,int noOfPlayers,int noOfCoins,String typeOfCarrom){
		System.out.println("Invoking String,double,int in Carrom");
		this.typeOfGame=typeOfGame;
		this.noOfPlayers=noOfPlayers;
		this.dimension=dimension;
		this.noOfCoins=noOfCoins;
		this.typeOfCarrom=typeOfCarrom;
	}
}