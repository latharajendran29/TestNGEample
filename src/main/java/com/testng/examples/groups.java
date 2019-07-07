package com.testng.examples;

import org.testng.annotations.Test;

public class groups {

	@Test(groups="pvr")
	public void vr() {
		
System.out.println("vr");
	}
	@Test(groups="pvr")
	public void inox() {
		System.out.println("inox");	

	}
	@Test(groups="pvr")
	public void forum() {
		System.out.println("forum");

	}
	@Test(groups="sky")
	public void skyswalk() {
		
		System.out.println("skswalk");
	}
	@Test(groups="sky")
public void ea() {
	
	System.out.println("ea");
}
public void abirami() {
	
	System.out.println("abirami");
}
	
}
