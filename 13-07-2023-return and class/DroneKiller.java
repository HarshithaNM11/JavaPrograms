class DroneKiller{
	public static void main(String[] args)
	{
		System.out.println("Invoking main in DroneKiller");
		
		double ref=Drone.getDistanceByFlight("Akash","Birthday");
		System.out.println("The value of ref is :"+ref);
		
		ref=Drone.getDistanceByFlight(null,"Birthday");
		System.out.println("The value of ref is :"+ref);
		
	}
}