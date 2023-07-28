class Engine1{
	static String getCCByModel(String model1,String model2,String model3,String model4,String model5,String model6)
	{
		System.out.println("Invoking getCCByModel in Engine");
		if(model1!=null &&model2!=null &&model3!=null &&model4!=null &&model5!=null &&model6!=null )
		{
			System.out.println("Engine names are "+model1+" ,"+model2+" ,"+model3+" ,"+model4+" ,"+model5+" ,"+model6);
			
			return "EngineNames";
		}
		
		else{
			System.err.println("model1 or model2 or model3 or model4 or model5 or model6 is invalid");
			return "Something";
		}
	}
}