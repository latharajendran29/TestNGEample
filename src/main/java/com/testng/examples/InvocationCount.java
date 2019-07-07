package com.testng.examples;

import org.testng.annotations.Test;

public class InvocationCount {
	 @Test(invocationCount=2)
		public void broswerlaunch() {
			System.out.println("broswerlaunch");

		}
		 @Test
	 public void loginpage() {
		System.out.println("loginpage");

	}
	 @Test(invocationCount=5)
	 public void searchproduct() {
		System.out.println("searchproduct");

	}
	 @Test
	 public void addtocart() {
		System.out.println("addtocart");

	}
	 @Test
	 public void logoutpage() {
		
	System.out.println("logoutpage");
	}
	 @Test
	 public void broswerclose() {
		System.out.println("broswerclose");

	}
}
