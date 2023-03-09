package POM2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadTestData 
{
 public static void main(String[] args) throws IOException
 {
	 String Path=".\\TestData\\Sample.xlsx";
	 
	 FileInputStream  inputstream = new FileInputStream(Path);
	 
	 XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
	 
	 XSSFSheet sheet =workbook.getSheetAt(0);
	 
	 /*int rows = sheet.getLastRowNum();
	 int cell =sheet.getRow(0).getLastCellNum();
	 
	 System.out.println(rows+" "+cell);*/
	 
	 Row row =sheet.getRow(0);
	 Cell cell = row.getCell(0);  
	 
	 System.out.println(cell);
	 System.out.println(sheet.getRow(2).getCell(3));
			 
 }
}
