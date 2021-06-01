package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class LecturaExcel {

	public LecturaExcel() {
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<String> LeerExcel(String filePath, String sheetName, int columnNumber) throws IOException {
		
		ArrayList<String> listaExcel = new ArrayList<String>();
		
        File file = new File(filePath);
		
		FileInputStream inputStream = new FileInputStream(file);
		
		XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);
		
		XSSFSheet newSheet = newWorkbook.getSheet(sheetName);
		
		int rowCount = newSheet.getLastRowNum() -  newSheet.getFirstRowNum();
		
		for (int i = 0; i <= rowCount; i++) {
			XSSFRow row = newSheet.getRow(i);
			XSSFCell cell = row.getCell(columnNumber);
			listaExcel.add(cell.getStringCellValue());
		}
		
		return listaExcel;
		
	}

}
