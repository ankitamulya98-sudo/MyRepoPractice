package Utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import ConstantsData.ConstantsData;

public class FetchDatafromExcel {
	
	public static String getURL(int x , int y) throws IOException
	{
		FileInputStream fs = new FileInputStream(ConstantsData.URL_EXCEL_PATH);
		try (XSSFWorkbook workbook = new XSSFWorkbook(fs)) {
			XSSFSheet sheet = workbook.getSheetAt(0);
			XSSFCell value = sheet.getRow(x).getCell(y);
			String URL = value.toString();
			return URL;
		}
		
		
	}
	
	public static void writeCustomerID(String customerId) throws IOException {

	    FileInputStream fis = new FileInputStream(ConstantsData.CUSTID_EXCEL_PATH);

	    XSSFWorkbook workbook = new XSSFWorkbook(fis);
	    XSSFSheet sheet = workbook.getSheet("Sheet1");

	    XSSFRow row = sheet.getRow(1);

	    if (row == null) {
	        row = sheet.createRow(1);
	    }

	    XSSFCell cell = row.createCell(0);
	    cell.setCellValue(customerId);

	    fis.close();

	    FileOutputStream fos = new FileOutputStream(ConstantsData.CUSTID_EXCEL_PATH);
	    workbook.write(fos);

	    fos.close();
	    workbook.close();
	}
	
	public static String getCustomerID() throws IOException {

		FileInputStream fis = new FileInputStream(ConstantsData.CUSTID_EXCEL_PATH);

	    XSSFWorkbook workbook = new XSSFWorkbook(fis);
	    XSSFSheet sheet = workbook.getSheet("Sheet1");

	    String customerID = sheet.getRow(1).getCell(0).toString();

	    workbook.close();
	    fis.close();

	    return customerID;
	}

}
