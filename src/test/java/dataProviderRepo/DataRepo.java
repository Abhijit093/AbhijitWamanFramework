package dataProviderRepo;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataRepo 
{
 
	@DataProvider
	public static Object[][] getData(Method name)
	{
		Object[][] data=new Object[3][4];
		
		data[0][0]="Admin";
		data[0][1]="Admin123";
		data[0][2]="Manager";
		data[0][3]=0654;
		
		data[1][0]="Test";
		data[1][1]="Admin123";
		data[1][2]="Tester";
		data[1][3]=0751;
		
		data[2][0]="Devloper";
		data[2][1]="Admin123";
		data[2][2]="LabAssistant";
		data[2][3]=0315;
		
		return data;		
	}
	
}
