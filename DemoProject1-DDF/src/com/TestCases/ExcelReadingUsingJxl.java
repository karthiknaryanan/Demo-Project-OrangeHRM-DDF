package com.TestCases;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class ExcelReadingUsingJxl {

	public static void main(String[] args) throws  IOException, BiffException {

		File file = new File("C:\\DemoProject1-DDF\\src\\testData.xls");

		Workbook workbook = Workbook.getWorkbook(file);
		
		Sheet sheet = workbook.getSheet("Sheet1");
		
		int columns = sheet.getColumns();
		int rows = sheet.getRows();
		
		System.out.println(columns);
		System.out.println(rows);
		
		String[][] data = new String[rows][columns];
		
		
		for(int i=0; i<rows;i++) {
			for(int j=0; j<columns;j++) {
				data[i][j]= sheet.getRow(i).toString();
			}
		
		System.out.println(data);
		}

	}

}
