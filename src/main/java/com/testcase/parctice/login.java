package com.testcase.parctice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;


public class login {
	
	String [][] data=null;
	@DataProvider(name="logindata")
	public String[][] logindataprovider() throws IOException  {
		return data=getexceldata();
	
	}
public static String[][] getexceldata( ) throws IOException {
	File f =new File("C:\\Users\\navin\\Documents\\New folder//sample.xlsx");
	FileInputStream xf=new FileInputStream(f);
	Workbook wb=new XSSFWorkbook(xf);
	Sheet sheetAt=wb.getSheetAt(0);
	
	for (int i = 1; i < sheetAt.getPhysicalNumberOfRows(); i++) {
		Cell cellheader=sheetAt.getRow(i).getCell(0);
		double d=cellheader.getNumericCellValue();
		long l=(long) d;
if(l==i) {
Cell cell=sheetAt.getRow(i).getCell(1);
String un=cell.getStringCellValue();
Cell cell2=sheetAt.getRow(i).getCell(2);
String ps=cell2.getStringCellValue();
System.out.println(un+ps);
	
	
/*	Row rowcount1=sheetAt.getRow(0);	
	String testdata[][]=new String[rowcount1-1][columcount];
	for (int i=1;i<rowcount1;i++) {
		for (int j=0;i<columcount;j++) {
			testdata[i-1][j]=sheetAt.getCell(j,i).getContents();*/
		
	}
	}
	return data;
	
}
	@Test(dataProvider ="logindata" )
	
	public void loginwithBothcorrect(String uname,String pword) {
		
	
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\src\\test\\resouce\\com\\selenium\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	WebElement username = driver.findElement(By.id("txtUsername"));
	username.sendKeys(uname);
	WebElement password = driver.findElement(By.id("txtPassword"));
	password.sendKeys(pword);
	WebElement loginbuutton = driver.findElement(By.id("btnLogin"));
	loginbuutton.click();
	driver.quit();
}
	public static void main(String[] args) throws IOException {
		getexceldata();
	}
}