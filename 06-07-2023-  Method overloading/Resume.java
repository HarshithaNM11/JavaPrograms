class Resume{
	static void format()
	{
		System.out.println("invoking format in resume");
		String type="Profile";
		int pages=2;
		System.out.println("Resume type :"+type);
		System.out.println("Resume pages :"+pages);
	}
	static void format(String type)
	{
		System.out.println("invoking format(String type) in resume");
		System.out.println("Resume type :"+type);
	}
	static void format(String type,int pages)
	{
		System.out.println("invoking format(String type,int pages) in resume");
		System.out.println("Resume type :"+type);
		System.out.println("Resume Pages :"+pages);
	}
	static void clear()
	{
		System.out.println("Resume format is clear");
	}
	static void delete()
	{
		System.out.println("Resume deleted");
	}
}