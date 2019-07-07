package com.testng.examples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testcases1 {
 @BeforeClass
	public void beforeclass() {
		System.out.println("beforeclass");

	}
 @BeforeMethod
 public void afterclas() {
	System.out.println("beforemethod");

}
 @Test
 public void test1() {
	System.out.println("test1");

}
 @Test
 public void test2() {
	System.out.println("test2");

}
 @AfterMethod
 public void AfterMethod() {
	
System.out.println("Aftermethod");
}
 @AfterClass
 public void afterclass() {
	System.out.println("Afterclass");

}
}
