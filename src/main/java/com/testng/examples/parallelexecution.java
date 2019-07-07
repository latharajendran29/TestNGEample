package com.testng.examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallelexecution {
	@Test
	public void opengoogle() {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\src\\test\\resouce\\com\\selenium\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.quit();
	}
	@Test
	public void openfacebook() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\src\\test\\resouce\\com\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	driver.quit();	
	}
	
	@Test
	public void openamazon() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\src\\test\\resouce\\com\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
	driver.quit();	
	}
}
