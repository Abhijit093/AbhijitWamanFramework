package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertClass 
{
 @Test
 public void hardAssert()
 {
	 System.out.println("This is 1st Hard Assert");
	 Assert.assertTrue(true);
	 
	 System.out.println("This is 2nd Hard Assert");
	 Assert.assertTrue(false);
	 
	 System.out.println("This is 3rd Hard Assert");
	 Assert.assertTrue(true);
	 
	 
 }
 
 @Test
 public void softAsser()
 {
	 SoftAssert soft = new SoftAssert();
	 
	 System.out.println("This is 1st Soft Assert");
	 soft.assertTrue(true);
	 
	 System.out.println("This is 2nd soft Asser");
	 soft.assertTrue(false);
	 
	 System.out.println("This is the 3rd soft Assert");
	 soft.assertTrue(true);
	 
	 soft.assertAll();
	 
	 
 }
}
