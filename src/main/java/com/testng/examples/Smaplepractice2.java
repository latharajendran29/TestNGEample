package com.testng.examples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Smaplepractice2 {
@BeforeClass
	public void broswerlaunch() {
		System.out.println("broswerlaunch");

	}
 @BeforeMethod
 public void loginpage() {
	System.out.println("loginpage");

}
 @Test
 public void searchproduct() {
	System.out.println("searchproduct");

}
 @Test
 public void addtocart() {
	System.out.println("addtocart");

}
 @AfterMethod
 public void logoutpage() {
	
System.out.println("logoutpage");
}
 @AfterClass
 public void broswerclose() {
	System.out.println("broswerclose");

}
}
