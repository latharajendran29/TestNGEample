package com.testng.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Crdentials {
	@DataProvider(name="credentials")
public Object[][] crden(){
	return new Object[][]{{"king","king123"},{"queen","queen123"}};
}
	@Test(dataProvider="credentials")
	public void facebook(String un,String ps) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\src\\test\\resouce\\com\\selenium\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.findElement(By.id("email")).sendKeys(un);
	driver.findElement(By.id("pass")).sendKeys(ps);
	}
}
