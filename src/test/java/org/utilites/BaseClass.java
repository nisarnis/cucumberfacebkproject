package org.utilites;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Base Class
public class BaseClass {
 public static	WebDriver driver;

	// Browser launch
	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	// Get Driver
	public static void geturl(String url) {
		driver.get(url);
	}

	// Maximize Window
	public static void maxWindow() {
		driver.manage().window().maximize();

	}

	// minimize Window
	public static void minWindow() {
		driver.manage().window();

	}

	// click
	public static void clickButton(WebElement element) {
		element.click();

	}

	// Sendkeys
	public static void fillTextBox(WebElement element, String input) {
		element.sendKeys(input);

	}

	// GetText
	public static void getTextFromWebpage(WebElement element) {
		element.getText();
	}

	// GetAttribute
	public static void getAttribute(WebElement element, String value) {
		element.getAttribute(value);
	}

	// close current page
	public static void close() {
		driver.close();
	}

	// close all tabs
	public static void quit() {
		driver.quit();

	}

	// Read Data From Excel
	public static void readDataFromExcel(String excelsheetname, String sheetname, int rowno, int cellno) throws IOException {
		// File location
		File f = new File("C:\\Users\\Home\\eclipse-workspace\\Frameworkmaven\\Excel" + excelsheetname + ".xlsx");
		// Read a file
		FileInputStream fis = new FileInputStream(f);
		// Workbook
		Workbook wrkbk = new XSSFWorkbook(fis);
		// Get Sheet
		Sheet sheet = wrkbk.getSheet(sheetname);
		// Fetch Row
		Row row = sheet.getRow(rowno);
		// Fetch cell
		Cell cell = row.getCell(cellno);
		// print in console
		System.out.println(cell);
	}

	// Create a Excel sheet
	public static void createExcelSheet(String Createexcelsheetname, String sheetname, int rowno, int cellno,
			int cellno1, String value, String value1) throws IOException {
		// File location
		File f = new File("C:\\Users\\Home\\eclipse-workspace\\Frameworkmaven\\Excel" + Createexcelsheetname + ".xlsx");

		// Workbook
		Workbook wrkbk = new XSSFWorkbook();
		// Get Sheet
		Sheet sheet = wrkbk.createSheet(sheetname);
		// Fetch Row
		Row row = sheet.createRow(rowno);
		// Fetch cell
		Cell cell = row.createCell(cellno);
		Cell cell2 = row.getCell(cellno1);
		// Assign value in cell
		cell.setCellValue(value);
		cell2.setCellValue(value1);
		// Write a file
		FileOutputStream fos = new FileOutputStream(f);
		wrkbk.write(fos);

	}

	// Date Format Changing into String
	public static void dateFormatChanging(int rowno, int cellno,String sheetname,String workbookname) throws IOException {
		// file location
		File f = new File("C:\\Users\\Home\\eclipse-workspace\\WebTable8Am\\Excel\\"+workbookname+".xlsx");
		// FileInputStream
		FileInputStream fis = new FileInputStream(f);
		// workbook
		Workbook wrkbk = new XSSFWorkbook(fis);
		// Get sheet
		Sheet sheet = wrkbk.getSheet(sheetname);
		// Iterate all rows
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			// Iterate all cells
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				String input;
				// celltype
				int type = cell.getCellType();
				// check  the date and changing to string
				if (type==1) {
					 input = cell.getStringCellValue();
					//System.out.println(input);
					
		
				}
				else if (DateUtil.isCellDateFormatted(cell)) {
					Date dat = cell.getDateCellValue();
					
				//date-------->string
					SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
					 input = sdf.format(dat);
					//System.out.println(input);
					}
				else {
					double d = cell.getNumericCellValue();
					//downcasting
					long l=(long)d;
					//numeric---->String
					 input = String.valueOf(l);
					//System.out.println(input);
				}
				
			}

		}
	
	}
//get title
	public static void getTitle( ) {
		String title = driver.getTitle();
		System.out.println(title);

	}
//Get currentUrl
	public static void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}
}
