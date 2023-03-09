package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo1 
{
 public static void main(String[] args) throws EncryptedDocumentException, IOException 
 {
   
	 String path ="‪F:\\Velocity\\Sample.xlsx";
	 	
	 FileInputStream file = new FileInputStream(path);
	 
	 Sheet a = WorkbookFactory.create(file).getSheet("Home");
	int row = a.getLastRowNum();
	System.out.println(row);
	 
	 
	 
 }
}
