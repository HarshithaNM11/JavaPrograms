package com.xworkz.app;

public class PoliceStation {
	public String name;
	public String location;
	public int officersCount;
	public boolean hasJail;
	public String emergencyNumber;

	public void arrest() {
		System.out.println("invoking arrest method in PoliceStation");
	}

	public void arrest(String name) {
		System.out.println("invoking arrest method of String in PoliceStation");
	}

	public void arrest(String name, String location) {
		System.out.println("invoking arrest method of String,String in PoliceStation");
	}

	public void arrest(String name, String location, int officersCount) {
		System.out.println("invoking arrest method of String,String,int in PoliceStation");
	}

	public void arrest(String name, String location, int officersCount, boolean hasJail) {
		System.out.println("invoking arrest method of String,String,int,boolean in PoliceStation");
	}

	public void arrest(String name, String location, int officersCount, boolean hasJail, String emergencyNumber) {
		System.out.println("invoking arrest method of String,String,int,boolean,String in PoliceStation");
	}

}
