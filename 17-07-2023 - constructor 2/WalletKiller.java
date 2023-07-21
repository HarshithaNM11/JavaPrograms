class WalletKiller{
	public static void main(String[] args)
	{
		System.out.println("Invoking Wallet in WalletKiller");
		Wallet wallet=new Wallet();
		
		System.out.println("---------------------------");
		Wallet wallet1=new Wallet("Bellroy",300,"Brown");
		System.out.println(wallet1.brand);
		System.out.println(wallet1.price);
		System.out.println(wallet1.color);
		//System.out.println("brand name in WalletKiller"+wallet1.brand);
		//System.out.println("price in WalletKiller"+wallet1.price);
		//System.out.println("color in WalletKiller"+wallet1.color);
	}
}