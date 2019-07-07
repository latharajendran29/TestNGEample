package com.testng.examples;

import java.io.File;
import java.io.IOException;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class Extendreports {
	
	WebDriver driver;
	ExtentReports extendtreport;
	ExtentHtmlReporter htmlreporter;
	ExtentTest testcase;
		@BeforeSuite
		public void launchbrowser() {
		
			extendtreport=new ExtentReports();
			htmlreporter=new ExtentHtmlReporter("Extendreport.html");
			extendtreport.attachReporter(htmlreporter);
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\src\\test\\resouce\\com\\selenium\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		@AfterSuite
		public void closebrowser() {
			driver.quit();
			extendtreport.flush();
		}
		
		@Test
		public void opengoogle() {
			testcase=extendtreport.createTest("verify Google title");
			testcase.log(Status.INFO, "navigating to google");
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		testcase.log(Status.INFO, "Actual title:" +title);
		testcase.log(Status.INFO, "Expected title:" + "Google");
		testcase.log(Status.INFO, "verification of actual and expected title");
		if(title.equals("Google")) {
		testcase.log(Status.PASS,"Actual title and expected title are  equal");
		}
		else {
			testcase.log(Status.FAIL,"Actual title and expected title are not equal");
		}
		}
		@Test
		public void openfacebook() throws IOException {
			testcase=extendtreport.createTest("verify facebook title");
			testcase.log(Status.INFO, "navigating to facebook");
			driver.get("https://www.facebook.com");
			
			String title=driver.getTitle();
			testcase.log(Status.INFO, "Actual title:" +title);
			testcase.log(Status.INFO, "Expected title:" + "Facebook");
			testcase.log(Status.INFO, "verification of actual and expected title");
			if(title.equals("Facebook")) {
				testcase.log(Status.PASS,"Actual title and expected title are  equal");
			
			}
			else {
				testcase.log(Status.FAIL,"Actual title and expected title are not equal");
				TakesScreenshot screenshot=(TakesScreenshot) driver;
				File sourcefile=screenshot.getScreenshotAs(OutputType.FILE);
				File Destination=new File("facebook.png");
				FileUtils.copyFile(sourcefile,Destination);
				testcase.addScreenCaptureFromPath("facebook.png");
			}
			}

		
		@Test
		public void openamazon() {
			testcase=extendtreport.createTest("verify amazon title");
			testcase.log(Status.INFO, "navigating to amazon");
		driver.get("https://www.amazon.in/");
		
		String title=driver.getTitle();
		testcase.log(Status.INFO, "Actual title:" +title);
		testcase.log(Status.INFO, "Expected title:" + "google");
		testcase.log(Status.INFO, "verification of actual and expected title");
		if(title.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in")) {
			testcase.log(Status.PASS,"Actual title and expected title are  equal");
		}
		else {
			testcase.log(Status.FAIL,"Actual title and expected title are not equal");
		}
		}
		
	}

