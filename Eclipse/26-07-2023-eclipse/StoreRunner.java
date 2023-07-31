class StoreRunner
{
	public static void main(String[] args)
	{
		System.out.println("Invoking main in StoreRunner");
		
		String[] emails={"harshitha2001@gmail.com","abc@gmail.com","anusha@gmail.com","aishwarya@gmail.com","vena@gmail.com","keerthana123@gmail.com","Satish@gmail.com"};
		String[] items={"Milk","Bread","Tomato","Onion","Chilli","Dal","Rice","curd","Wheat"};
		String[] teams={"RCB","CSK","MI","RR","SunRises","Kings Punjab","KKR","Delhi capitals"};
		
		
		
		Store s1=new Store();
		System.out.println("======================================================================================");
		s1.emails(emails);
		System.out.println("======================================================================================");
		s1.groceryItems(items);
		System.out.println("======================================================================================");
		s1.iplTeams(teams);
	}
}