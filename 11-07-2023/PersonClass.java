class PersonClass{
	static int getAgeByName(String name ){
		System.out.println("invoking getAgeByName in PersonClass{");
		if(name!=null){
			System.out.println("getAgeByName is valid");
			if("Seemitha"==name){
			return 22;
		    }
		    if("Santhosh"==name){
			return 52;
		    }
		    if("Janaki"==name){
			return 46;
		    }
		    if("Sinchana"==name){
			return 19;
		    }
		    if("Jayanath"==name){
			return 48;
		    }
		    if("Kavya"==name){
			return 21;
		    }
			if("Shravya"==name){
			return 22;
		    }
			if("Chaitra"==name){
			return 35;
		    }
			if("Prashant"==name){
			return 32;
		    }
			if("Prakash"==name){
			return 42;
		    }
			
		else{
			System.err.println("getAgeByName is in valid");
		    }
			
		}
		return 10;
		
	}
	
}