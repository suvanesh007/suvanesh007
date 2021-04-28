package FileOperationInExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileOperationExcel {
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\ELCOT\\eclipse-workspace\\DemomavenCode\\Excel\\DemoExcel.xlsx");

		FileInputStream stream=new FileInputStream(file);
		Workbook w=new XSSFWorkbook(stream);
		Sheet s=w.getSheet("Sheet1");
		
		//Row r = s.getRow(1);
		//int numberOfRows = s.getPhysicalNumberOfRows();
		//System.out.println(numberOfRows);
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			
			Row r = s.getRow(i);
		
for (int j = 0; j <r.getPhysicalNumberOfCells(); j++) {
	Cell c = r.getCell(j);
	System.out.println(c);
}
}
	}
}



