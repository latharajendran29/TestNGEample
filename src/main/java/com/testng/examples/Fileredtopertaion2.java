package com.testng.examples;
import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Fileredtopertaion2 {

	public static String hetvaluesfromexcel(int rownum, int cellnum) throws IOException  {
		File f =new File("C:\\Users\\navin\\Documents\\New folder//sample.xlsx");
		FileInputStream xf=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(xf);
		Sheet sheetAt=wb.getSheetAt(0);
		//for (int m = 1; m < sheetAt.getPhysicalNumberOfRows(); m++) {
			
		
		Cell cell=sheetAt.getRow(rownum).getCell(cellnum);
		String value=null;
		
		if(cell.getCellType().equals(CellType.STRING)) {
			value=cell.getStringCellValue();
		}
		else if(cell.getCellType().equals(CellType.NUMERIC)) {
			double d=cell.getNumericCellValue();
			long l=(long) d;
			value=String.valueOf(1);
			
	
		}
		return value;
		}
		
		
	//}
		public static void main(String[] args) throws IOException {
			String valuefromexcel=hetvaluesfromexcel(2,2);
			System.out.println(valuefromexcel);
		}
		}