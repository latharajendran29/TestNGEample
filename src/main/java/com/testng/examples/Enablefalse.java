package com.testng.examples;


import org.testng.annotations.Test;

public class Enablefalse {
	 @Test(enabled=false)
		public void broswerlaunch() {
			System.out.println("broswerlaunch");

		}
		 @Test
	 public void loginpage() {
		System.out.println("loginpage");

	}
	 @Test
	 public void searchproduct() {
		System.out.println("searchproduct");

	}
	 @Test(enabled=true)
	 public void addtocart() {
		System.out.println("addtocart");

	}
	 @Test(enabled=false)
	
	 public void logoutpage() {
		
	System.out.println("logoutpage");
	}
	 @Test
	 public void broswerclose() {
		System.out.println("broswerclose");

	}
}
