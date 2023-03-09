package testNGDemo;

import org.testng.SkipException;
import org.testng.annotations.Test;

import dataProviderRepo.DataRepo;

public class Demo7 

{
 @Test(priority=1,dataProviderClass=DataRepo.class,dataProvider="getData")
  public void userName(String username, String Password, String position, int emp_id)
  {
	 System.out.println("test1");
	 System.out.println(username + Password+ position+emp_id);
  }
 	
 @Test(priority=2,dataProviderClass=DataRepo.class,dataProvider="getData")
 public void passWord(String username, String Password, String position, int emp_id)
 {
	 System.out.println("test2");
	 System.out.println(username + Password+ position+emp_id);
	 throw new SkipException("Skipping-This not ready for testing");
 }
 
 @Test(priority=3,dataProviderClass=DataRepo.class,dataProvider="getData")
 public void designation(String username, String Password, String position, int emp_id)
 {
	 System.out.println("test3");
	 System.out.println(username + Password+ position+emp_id); 
 }
 
 @Test(priority=4,dataProviderClass=DataRepo.class,dataProvider="getData")
 public void empID(String username, String Password, String position, int emp_id)
 {
	 System.out.println("test4");
	 System.out.println(username + Password+ position+emp_id);
 }
 
}
