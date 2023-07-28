class GymKiller{
	
	public static void main(String[] values)
	{
	System.out.println("running main in GymKiller");
	Gym gym=new Gym();
	System.out.println(gym.name);
	System.out.println(gym.location);
	System.out.println(gym.timings);
	System.out.println(gym.price);
	System.out.println(gym.noOfPeople);
	gym.name="Akasha";
	gym.location="vijayanagar";
	gym.timings=10.30;
	gym.price=1500;
	gym.noOfPeople=100;
	System.out.println(gym.name);
	System.out.println(gym.location);
	System.out.println(gym.timings);
	System.out.println(gym.price);
	System.out.println(gym.noOfPeople);
	System.out.println("-------------------------------------");
	
	Gym gym1=new Gym();
	System.out.println(gym1.name);
	System.out.println(gym1.location);
	System.out.println(gym1.timings);
	System.out.println(gym1.price);
	System.out.println(gym1.noOfPeople);
	gym1.name="Adithi";
	gym1.location="Kengeri";
	gym1.timings=10.30;
	gym1.price=100;
	gym1.noOfPeople=175;
	System.out.println(gym1.name);
	System.out.println(gym1.location);
	System.out.println(gym1.timings);
	System.out.println(gym1.price);
	System.out.println(gym1.noOfPeople);
	
	}
	
}