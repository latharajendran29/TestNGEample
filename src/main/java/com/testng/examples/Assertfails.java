package com.testng.examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertfails {
@Test
	public void test1() {
		
Assert.fail();
System.out.println("pass");
	}
@Test(retryAnalyzer = Retryanalzer.class)
	public void test2() {
		
		
Assert.fail();
System.out.println("pass");
	}
@Test
	public void test3() {

System.out.println("pass");

	}
@Test
	public void test4() {
		

System.out.println("pass");

	}
@Test
	public void test5() {
		
		
Assert.fail();
System.out.println("pass");
	}
	
}
