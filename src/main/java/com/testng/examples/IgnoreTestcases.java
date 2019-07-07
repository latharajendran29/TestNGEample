package com.testng.examples;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTestcases {
	 @Test
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
	 @Test@Ignore
	 public void addtocart() {
		System.out.println("addtocart");

	}
	 @Test
	 public void logoutpage() {
		
	System.out.println("logoutpage");
	}
	 @Test@Ignore
	 public void broswerclose() {
		System.out.println("broswerclose");

	}
}
