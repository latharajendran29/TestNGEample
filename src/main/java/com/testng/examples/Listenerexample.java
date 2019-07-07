package com.testng.examples;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listenerexample implements ITestListener{

	public void onTestStart(ITestResult result) {
System.out.println("Test case is going to execute");	
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("test case is passed");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("test case is failure");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("test case is skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		System.out.println("before everything");
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("after everything");
	}

}
