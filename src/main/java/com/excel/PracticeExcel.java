package com.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PracticeExcel {

	FileInputStream fis;
	XSSFWorkbook wb;

	public void getExcelData(int rowIndex, int columnIndex) {

		File file = new File("./src/main/resources/Login_Test_Cases.xlsx");

		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Call my sheet as worksheet and get my sheet by index or sheet name
		XSSFSheet sht = wb.getSheetAt(0);
		// XSSFSheet sht = wb.getSheet("Practice1");

		// find all rows
		int totalRow = sht.getPhysicalNumberOfRows();

		for (int i = 0; i < totalRow; i++) {
			if (i == rowIndex) {
				Row row = sht.getRow(i);
				// total number of columns
				row.getLastCellNum();
				// start another loop for column
				for (int j = 0; j < totalRow; j++) {
					if (j == columnIndex) {
						Cell cell = row.getCell(j);

						System.out.println(cell.getStringCellValue());
					}
				}
			}
		}

	}

	public static void main(String[] args) {
		PracticeExcel obj = new PracticeExcel();
		obj.getExcelData(0, 0);
		obj.getExcelData(2, 1);
		obj.getExcelData(3, 3);
		obj.getExcelData(5, 1);
	}

}
