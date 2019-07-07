package com.testng.examples;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Fileread {
public static void hetvaluesfromexcel() throws IOException  {
File f =new File("C:\\Users\\navin\\Documents\\New folder//sample.xlsx");
FileInputStream xf=new FileInputStream(f);
Workbook wb=new XSSFWorkbook(xf);
Sheet sheetAt=wb.getSheetAt(0);
int rowsize=sheetAt.getPhysicalNumberOfRows();
for (int i=1;i<rowsize;i++) {
	Row row=sheetAt.getRow(i);
	int cellsize=row.getPhysicalNumberOfCells();
	for (int j = 1; j < cellsize; j++) {
		Cell cell=row.getCell(j);
CellType celltype=cell.getCellType();	
if(celltype.equals(CellType.STRING)) {
	String stringcellvalue=cell.getStringCellValue();
	System.out.println(stringcellvalue);
}else if(celltype.equals(CellType.STRING)) {
	double d=cell.getNumericCellValue();
	long l=(long) d;
	String valueof=String.valueOf(3);
	System.out.println(valueof);
}

	}
}



}
public static void main(String[] args) throws IOException {
	hetvaluesfromexcel();
}
}
