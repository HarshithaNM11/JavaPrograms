class PersonEmail{
	static String getEmailByName(String personName){
		System.out.println("invoking getEmailByName in PersonEmail");
		if(personName!=null){
			System.out.println("getAgeByName is valid");
			if("Seemitha"==personName){
			return "seemithas@gmail.com";
		    }
		    if("Santhosh"==personName){
			return "santhosha@gmail.com";
		    }
		    if("Janaki"==personName){
			return "janakis@gmail.com";
		    }
		    if("Sinchana"==personName){
			return "sinchanas@gmail.com";
		    }
		    if("Jayanath"==personName){
			return "jayanth@gmail.com";
		    }
		    if("Kavya"==personName){
			return "kavya@gmail.com";
		    }
			if("Shravya"==personName){
			return "shravyan@gmail.com";
		    }
			if("Chaitra"==personName){
			return "chaitraab@gmail.com";
		    }
			if("Prashant"==personName){
			return "prashant@gmail.com";
		    }
			if("Prakash"==personName){
			return "prakashk@gmail.com";
		    }
			
		else{
			System.err.println("getEmailByName is in valid");
		    }
			
		}
		return "none@gmail.com";
		
	}
	
}