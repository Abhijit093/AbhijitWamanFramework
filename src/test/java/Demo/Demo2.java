package Demo;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Demo2 
{
 @Test(priority=1, invocationCount=2)
 public void start()
 {
	 System.out.println("First Method");
	 throw new SkipException("skip");
 }
 
 @Test(priority=2)
 public void middle()
 {
	 Assert.fail("fail");
	 System.out.println("Second method");
	 
 }
 
 @Test(priority=3,dependsOnMethods="middle",alwaysRun=true)
 public void last()
 {
	 System.out.println("third method");
	 
 }
 
 @Test(priority=4, description="token")
 public void token()
 {
	 System.out.println("forth method");
 }
 
 @Test(priority=5,expectedExceptions=ArithmeticException.class)
 public void back()
 {
	 
	 System.out.println("fifth method");
	 System.out.println(5/0);
	 
 }
 
}
