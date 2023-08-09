package com.xworkz.boot;

import com.xworkz.app.DigitalLibrary;
import com.xworkz.app.Library;

public class LibraryRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in Libraryrunner");

		Library library = new DigitalLibrary();
		library.displyaInfo();
		System.out.println("*********Child ref**********");
		DigitalLibrary digitalLibrary = new DigitalLibrary();
		digitalLibrary.displyaInfo();

	}

}
