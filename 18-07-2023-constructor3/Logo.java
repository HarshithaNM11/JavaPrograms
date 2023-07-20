class Logo{
	String logoType;
	String logoFile;
	String logoVariations;
	int sizeInPixel;
	String textName;
	int textSize;
	String fontColor;
	String fontStyle;
	float imageSize;

	
	Logo(){
		System.out.println("Invoking No-arguments in Logo");
		System.out.println("Logo Type  in Constructor:"+this.logoType);
		System.out.println("Logo File in Constructor:"+this.logoFile);
		System.out.println("Logo Variations in Constructor:"+this.logoVariations);
		System.out.println("Logo sizeInPixel  in Constructor:"+this.sizeInPixel);
		System.out.println("Logo textName in Constructor:"+this.textName);
		System.out.println("Logo textSize  in Constructor:"+this.textSize);
		System.out.println("Logo fontColor in Constructor:"+this.fontColor);
		System.out.println("Logo fontStyle  in Constructor:"+this.fontStyle);
		System.out.println("Logo imageSize in Constructor:"+this.imageSize);
	}
	Logo(String logoType){
		System.out.println("Invoking string argument in Logo");
		this.logoType=logoType;
		this.logoFile=logoFile;
		this.logoVariations=logoVariations;
		this.sizeInPixel=sizeInPixel;
		this.textName=textName;
		this.textSize=textSize;
		this.fontColor=fontColor;
		this.fontStyle=fontStyle;
		this.imageSize=imageSize;
	}
	Logo(String logoType,String logoFile,String logoVariations){
		System.out.println("Invoking string argument in Logo");
		this.logoType=logoType;
		this.logoFile=logoFile;
		this.logoVariations=logoVariations;
		this.sizeInPixel=sizeInPixel;
		this.textName=textName;
		this.textSize=textSize;
		this.fontColor=fontColor;
		this.fontStyle=fontStyle;
		this.imageSize=imageSize;
	}
	Logo(String logoType,String logoFile,String logoVariations,int sizeInPixel){
		System.out.println("Invoking string ,int argument in Logo");
		this.logoType=logoType;
		this.logoFile=logoFile;
		this.logoVariations=logoVariations;
		this.sizeInPixel=sizeInPixel;
		this.textName=textName;
		this.textSize=textSize;
		this.fontColor=fontColor;
		this.fontStyle=fontStyle;
		this.imageSize=imageSize;
	}
	Logo(String logoType,String logoFile,String logoVariations,int sizeInPixel,String textName){
		System.out.println("Invoking string ,int argument in Logo");
		this.logoType=logoType;
		this.logoFile=logoFile;
		this.logoVariations=logoVariations;
		this.sizeInPixel=sizeInPixel;
		this.textName=textName;
		this.textSize=textSize;
		this.fontColor=fontColor;
		this.fontStyle=fontStyle;
		this.imageSize=imageSize;
	}
	Logo(String logoType,String logoFile,String logoVariations,int sizeInPixel,String textName,int textSize){
		System.out.println("Invoking string,int argument in Logo");
		this.logoType=logoType;
		this.logoFile=logoFile;
		this.logoVariations=logoVariations;
		this.sizeInPixel=sizeInPixel;
		this.textName=textName;
		this.textSize=textSize;
		this.fontColor=fontColor;
		this.fontStyle=fontStyle;
		this.imageSize=imageSize;
	}
	Logo(String logoType,String logoFile,String logoVariations,int sizeInPixel,String textName,int textSize,String fontColor){
		System.out.println("Invoking string ,int argument in Logo");
		this.logoType=logoType;
		this.logoFile=logoFile;
		this.logoVariations=logoVariations;
		this.sizeInPixel=sizeInPixel;
		this.textName=textName;
		this.textSize=textSize;
		this.fontColor=fontColor;
		this.fontStyle=fontStyle;
		this.imageSize=imageSize;
	}
	Logo(String logoType,String logoFile,String logoVariations,int sizeInPixel,String textName,int textSize,String fontColor,String fontStyle){
		System.out.println("Invoking string,int  argument in Logo");
		this.logoType=logoType;
		this.logoFile=logoFile;
		this.logoVariations=logoVariations;
		this.sizeInPixel=sizeInPixel;
		this.textName=textName;
		this.textSize=textSize;
		this.fontColor=fontColor;
		this.fontStyle=fontStyle;
		this.imageSize=imageSize;
	}
	Logo(String logoType,String logoFile,int logoVariations,int sizeInPixel,String textName,int textSize,String fontColor,String fontStyle,int imageSize){
		System.out.println("Invoking string,int argument in Logo");
		this.logoType=logoType;
		this.logoFile=logoFile;
		this.logoVariations=logoVariations;
		this.sizeInPixel=sizeInPixel;
		this.textName=textName;
		this.textSize=textSize;
		this.fontColor=fontColor;
		this.fontStyle=fontStyle;
		this.imageSize=imageSize;
	}
}