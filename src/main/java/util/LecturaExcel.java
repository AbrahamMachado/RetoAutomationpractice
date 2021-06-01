package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LecturaExcel {

	public LecturaExcel() {
		// TODO Auto-generated constructor stub
	}
	
	public String getCellValue(String filePath, String sheetName, int rowNumber, int cellNumber) throws IOException {
        File file = new File(filePath);
		
		FileInputStream inputStream = new FileInputStream(file);
		
		XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);
		
		XSSFSheet newSheet = newWorkbook.getSheet(sheetName);
		
		XSSFRow row = newSheet.getRow(rowNumber);
		
		XSSFCell cell = row.getCell(cellNumber);
		
		return cell.getStringCellValue();
		
	}

}
