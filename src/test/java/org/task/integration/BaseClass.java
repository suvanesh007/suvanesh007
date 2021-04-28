package org.task.integration;

import java.io.FileInputStream;
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
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	static WebDriver driver;

	public static void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void launchUrl(String data) {
		driver.get(data);
	}
	public static void enterText(WebElement element, String data) {
		element.sendKeys(data);
	}
	public static void btnClick(WebElement element) {
		element.click();
	}
	public static void selectByVis(WebElement element, String data) {
		Select se=new Select(element);
		se.selectByVisibleText(data);
	}
	public static String sheetLocation(int rowno, int cellno) throws IOException {
		FileInputStream stream=new FileInputStream("C:\\\\Users\\\\ELCOT\\\\eclipse-workspace\\\\DemomavenCode\\\\Excel\\\\DemoExcel.xlsx");
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(rowno);
		Cell c = r.getCell(cellno);
		int type = c.getCellType();
		String value ="";
		if (type==1) {
			value = c.getStringCellValue();
		}else if (DateUtil.isCellDateFormatted(c)) {
			Date dateCellValue = c.getDateCellValue();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
			value = dateFormat.format(dateCellValue);
		}else {
			double numericCellValue = c.getNumericCellValue();
			Long l = (long) numericCellValue;
			value = String.valueOf(1);	
		}
		return value;
	}
	private static void date() {
		SimpleDateFormat dateFormat = new SimpleDateFormat();
	}
	private void getAttribute(WebElement element, String value) {
		String attribute = element.getAttribute(value);
		System.out.println(attribute);
	}

}










