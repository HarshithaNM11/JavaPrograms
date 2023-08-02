package com.xworkz.boot;

import com.xworkz.app.GrandChild;

public class GrandParentRunner {

	public static void main(String[] args) {
		System.out.println("running main in GrandParentRunner");
		
		GrandChild child=new GrandChild();
		
		child.work();
		child.scold();
		child.eat();
		child.run();
		

	}

}