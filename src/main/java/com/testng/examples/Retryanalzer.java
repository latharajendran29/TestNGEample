package com.testng.examples;


import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retryanalzer implements  IRetryAnalyzer{
	int minimumcount=0;
	int maxmiumcount=5;
	public boolean retry(ITestResult result) {
		if(minimumcount<maxmiumcount) {
			minimumcount++;
			return true;
		}
		return false;
	}
	

			
}
