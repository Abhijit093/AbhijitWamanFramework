package Siemens;

import org.testng.annotations.Test;

import CodeTest.Siemens.SearchHospitalResult;
import SiemensTest.TestBase_Siemens;

public class Siemens_Testclass extends TestBase_Siemens {

@Test
public void stratExcution() throws InterruptedException{
	
	SearchHospitalResult search = new SearchHospitalResult();
	search.clickOnSearchBox();	
}
}
