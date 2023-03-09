package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	 String path ="‪F:\\Velocity\\Sample.xlsx";
	 
	 
	 FileInputStream file = new FileInputStream(path);
	 
	 String str = WorkbookFactory.create(file).getSheet("Home").getRow(1).getCell(1).getStringCellValue();
	  System.out.println(str);
	  
	}

}
