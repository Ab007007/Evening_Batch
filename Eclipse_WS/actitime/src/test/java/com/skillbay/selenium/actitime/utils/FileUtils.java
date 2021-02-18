package com.skillbay.selenium.actitime.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtils {

	static String fileName = "data/globaldata.properties";
	
	static String dataFile = "data/actitime_testdata.xls";
	static File file =null;
	static FileInputStream fis  = null;
	static Workbook wb = null;
	static Sheet sheet = null;
	static Row row = null;
	
	public static String getGlobalData(String name)
	{
		System.out.println("--- Reading value from properties file ---");
		String value = null;
		Properties props = new Properties();
		try 
		{
			props.load(new FileInputStream(new File(fileName)));
			value = props.getProperty(name);
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("returing " + value);
		return value;
	}
	
	public static Sheet getSheet(String sheetname)
	{
		wb = getWorkbook();
		sheet = wb.getSheet(sheetname);
		return sheet;
	}
	
	public static Workbook getWorkbook()
	{
		try 
		{
			wb = WorkbookFactory.create(new FileInputStream(new File(dataFile)));
		}
		catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return wb;
	}
	
	public static int getRowCount(String sheetname)
	{
		sheet = getSheet(sheetname);
		return sheet.getLastRowNum()+1;
	}
	
	public static String getCellValue(String sheetname, int rownum, int colnum)
	{
		sheet  = getSheet(sheetname);
		row = sheet.getRow(rownum);
		Cell cell = row.getCell(colnum);
		return cell.toString();
	}
	
	/*
	 * public static void main(String[] args) { try { wb =
	 * WorkbookFactory.create(new FileInputStream(new File(dataFile))); sheet =
	 * wb.getSheet("create_customer"); System.out.println(sheet.getLastRowNum());
	 * for (int i = 0; i <= sheet.getLastRowNum(); i++) { row = sheet.getRow(i);
	 * System.out.println("|" + row.getCell(0) + " | " + row.getCell(1) + " | "); }
	 * } catch (EncryptedDocumentException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } catch (FileNotFoundException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); } catch (IOException e) { //
	 * TODO Auto-generated catch block e.printStackTrace(); } finally { try {
	 * wb.close(); } catch (IOException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } } }
	 */


}
