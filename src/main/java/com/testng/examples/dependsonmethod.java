package com.testng.examples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class dependsonmethod {
	@Test
	public void broswerlaunch() {
		System.out.println("broswerlaunch");

	}
	@Test
 public void loginpage() {
	System.out.println("loginpage");

}
 @Test(enabled=true)
 public void searchproduct() {
	System.out.println("searchproduct");

}
 @Test
 (dependsOnMethods="searchproduct")
 public void addtocart() {
	System.out.println("addtocart");

}
 @Test(dependsOnMethods="addtocart")
 public void logoutpage() {
	
System.out.println("logoutpage");
}@Test
 public void broswerclose() {
	System.out.println("broswerclose");

}
}
