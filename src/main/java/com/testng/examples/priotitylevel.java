package com.testng.examples;

import org.testng.annotations.Test;

public class priotitylevel {
	 @Test(priority=-2)
		public void broswerlaunch() {
			System.out.println("broswerlaunch");

		}
		 @Test(priority=-1)
	 public void loginpage() {
		System.out.println("loginpage");

	}
	 @Test(priority=3)
	 public void searchproduct() {
		System.out.println("searchproduct");

	}
	 @Test(priority=6)
	 public void addtocart() {
		System.out.println("addtocart");

	}
	 @Test(priority=8)
	 public void logoutpage() {
		
	System.out.println("logoutpage");
	}
	 @Test
	 public void broswerclose() {
		System.out.println("broswerclose");

	}
}
