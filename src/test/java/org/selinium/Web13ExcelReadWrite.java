package org.selinium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Web13ExcelReadWrite {
	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		// Excel Sheet in Library Folder
		File f = new File("C:\\Users\\Windows\\workspace\\3.Dhinesh.Selinium\\Library\\JavaSheet.xlsx");
		FileOutputStream f1 = new FileOutputStream(f);
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("First");
		
		XSSFRow row1 = sheet.createRow(0);
		XSSFCell cell1 = row1.createCell(0);
		XSSFCell cell2 = row1.createCell(1);
		
		cell1.setCellValue("Mark");
		cell2.setCellValue(345.0);
		
		XSSFRow row2 = sheet.createRow(1);
		XSSFCell cell3 = row2.createCell(0);
		XSSFCell cell4 = row2.createCell(1);
		
		cell3.setCellValue("Scores");
		cell4.setCellValue(118.5);
		
		workbook.write(f1);
		workbook.close();
		
		@SuppressWarnings("resource")
		FileInputStream f2 = new FileInputStream(f);
		XSSFSheet sheet1 = workbook.getSheet("First");
		
		XSSFRow row3 = sheet1.getRow(0);
		XSSFCell cell5 = row3.getCell(0);
		XSSFCell cell6 = row3.getCell(1);
		
		String text1 = cell5.getStringCellValue();
		System.out.println(text1);
		
		double num1 = cell6.getNumericCellValue();
		System.out.println(num1);
		
		XSSFRow row4 = sheet1.getRow(1);
		XSSFCell cell7 = row4.getCell(0);
		XSSFCell cell8 = row4.getCell(1);
		
		String text2 = cell7.getStringCellValue();
		System.out.println(text2);
		
		double num2 = cell8.getNumericCellValue();
		System.out.println(num2);
		
		workbook.close();
				
		System.out.println("Code Complete");
	
	}
}