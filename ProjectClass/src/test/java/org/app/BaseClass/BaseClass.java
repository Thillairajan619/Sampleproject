package org.app.BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.AfterClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class BaseClass {
public static WebDriver driver = null;
	
   // @BeforeClass
	public static void browserlaunch() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
    public static void url(String url) {
		driver.get(url);
	}
	
	
	/*
	public static String excelReadDataReuseable(int a , int b) {
		String value =null;
		try {
			// location
			File f = new File("C:\\Users\\THILLAI\\eclipse-workspace\\ProjectClass\\src\\test\\Maintain data.xlsx");	
			// read -> FileInput
			FileInputStream fis = new FileInputStream(f);
			// work book 
			Workbook wb = new XSSFWorkbook(fis);
			// sheet
			Sheet sheet = wb.getSheet("Sheet1");
			//row
			Row row = sheet.getRow(a);
			Cell cell = row.getCell(b);
			//System.out.println(cell);
			int celltype = cell.getCellType();
			if(cellType==1) {
				value = cell.getStringCellValue();
				System.out.println(value);
			}else if(cellType==0) {
				if(DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
			value = s.format(dateCellValue);
			System.out.println(value);
			}
				else {
					double number = cell.getNumericCellValue();
					long l = (long)number;
					value = String.valueOf(l);
					System.out.println(value);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
		}
	*/
	public static void selectValue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}
	
	public static void typedata(WebElement element, String data) {
		element.sendKeys(data);
	}
	
	public static void clickdata(WebElement element) {
		element.click();
	}

	//@AfterClass
	public static void closewindow() {
		driver.close();
	}
	@DataProvider(name = "onedata")
	public  Object[][]  excelread() throws Exception {
		Object[][] twoarr = null;
		Object value = null;
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\THILLAI\\Downloads\\Test_One_Two (2) (1)\\Test_One_Two\\src\\test\\resources\\TestData\\July_Offline.xlsx"));
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		// to point sheet in index 
		//Sheet sheet = wb.getSheetAt(0);
		int noofrows = sheet.getPhysicalNumberOfRows();
		int noofcells = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(noofrows);
		System.out.println(noofcells);
		// declaring two dim array
		twoarr = new Object[noofrows-1][noofcells];
		for (int i = 1; i <noofrows ; i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j <noofcells; j++) {
				Cell cell = row.getCell(j);
				org.apache.poi.ss.usermodel.CellType cellType = cell.getCellType();
				if(cellType==org.apache.poi.ss.usermodel.CellType.STRING) {
					value = cell.getStringCellValue();
					System.out.println(value);
			}else if(cellType==CellType.NUMERIC) {
					 double d = cell.getNumericCellValue();	
					long l = (long)d;
					value= String.valueOf(l);
					System.out.println(value);
				}else if(DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat sb = new SimpleDateFormat("dd/MM/yyyy");
					value = sb.format(dateCellValue);
					System.out.println(value);
				}
				twoarr[i-1][j]=value;
			}	
		}
		return twoarr;
	}


}


