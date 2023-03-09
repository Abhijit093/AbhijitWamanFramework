package Demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData 
{
 public static void main(String[] args) throws Exception
 {
	 String path ="‪F\\Study\\Sample.xlsx";
	 
	 System.out.println(path);
	 
	 FileInputStream file = new FileInputStream(path);
	 XSSFWorkbook workbook =new XSSFWorkbook(file);
	 XSSFSheet sheet = workbook.getSheet("Home");
	 
	 
	 int row = sheet.getLastRowNum();
	 System.out.println(row);
	 
	 int column = sheet.getRow(1).getLastCellNum();
	 System.out.println(column);
	 
	 
	 workbook.close();
	 file.close();
	 
			
			 
 }
}
