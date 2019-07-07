package com.testng.examples;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datadriven4 {

	public static String hetvaluesfromexcel(int userid) throws IOException  {
		File f =new File("C:\\Users\\navin\\Documents\\New folder//sample.xlsx");
		FileInputStream xf=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(xf);
		Sheet sheetAt=wb.getSheetAt(0);
		String value=null;
		for (int i = 1; i < sheetAt.getPhysicalNumberOfRows(); i++) {
			Cell cellheader=sheetAt.getRow(i).getCell(0);
			double d=cellheader.getNumericCellValue();
			long l=(long) d;
if(l==userid) {
Cell cell=sheetAt.getRow(i).getCell(1);
String un=cell.getStringCellValue();
Cell cell2=sheetAt.getRow(i).getCell(2);
String ps=cell2.getStringCellValue();
System.out.println(un+ps);

}
}
	return value;				
		}
			
		
		public static void main(String[] args) throws IOException {
			String valuefromexcel=hetvaluesfromexcel(3);
		}
}
