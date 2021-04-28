package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\ELCOT\\eclipse-workspace\\DemomavenCode\\Excel\\DemoExcel.xlsx");
		FileInputStream stream=new FileInputStream(file);
		Workbook w=new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Sheet1");
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				int type = c.getCellType();
				if (type==1) {
					String name = c.getStringCellValue();
					System.out.println(name);					
				}
				if (type==0) {
					if (DateUtil.isCellDateFormatted(c)) {
						Date date = c.getDateCellValue();
						SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MMM-yy");
						String name = dateFormat.format(date);
						System.out.println(name);	
					}
					else {
						double d = c.getNumericCellValue();
						Long l=(long) d;
						String name=String.valueOf(l);
						System.out.println(name);		
					}
				}
				
				
				
			}
			
			
			
			
			
			
		}
		
		
		
		
		
		
	}
}
