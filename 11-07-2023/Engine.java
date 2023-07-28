class Engine{
	static int getCCByModel(String modelName ){
		System.out.println("invoking getCCByModel in Engine");
		if(modelName!=null){
			System.out.println("getCCByModel is valid");
			if("Swift"==modelName){
			return 1197;
		    }
		    if("Rapid"==modelName){
			return 1498;
			
		    }
		    if("BMW"==modelName){
			return 2998;
		    }
		    if("Benz"==modelName){
			return 1993;
		    }
		    if("Audi"==modelName){
			return 1998;
		    }
		    if("Bentely"==modelName){
			return 3993;
		    }
		else{
			System.err.println("getCCByModel is in valid");
		    }
			
		}
		return 999;
		
	}
	
}