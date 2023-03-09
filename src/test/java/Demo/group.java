package Demo;

import org.testng.annotations.Test;

public class group 
{
  @Test(priority=1,groups={"Sanity","Smoke"})
  public void m1()
  {
    System.out.println("This is 1st Case");	  
  }
  @Test(priority=2,groups={"Sanity","Smoke","Regresstion"})
  public void m2()
  {
	  System.out.println("This is 2nd Case");
  }
  
  @Test(priority=3,groups={"Regresstion"})
  public void m3()
  {
	  System.out.println("This is 3rd Case");
  }
  
  @Test(priority=4,groups={"Regresstion"})
  public void m4()
  {
	  System.out.println("This is 4th Case");
  }
  
	
}
