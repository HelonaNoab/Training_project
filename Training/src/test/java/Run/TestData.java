package Run;

import org.testng.annotations.Test;

import Com.pages.Home;
import Common.browsers;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;

public class TestData  extends browsers{
  @Test(dataProvider = "Signin")
  public void f(String n, String s) throws InterruptedException {
	  Com.pages.Home h= new Com.pages.Home(driver);
		h.Emailidfield("Zoha.kharazmi@yahoo.com");
		h.psswordfield("zk");
		h.loginbt();
		h.empty();
		driver.navigate().back();
		Reporter.log("Executed Sucessfully.");
		Thread.sleep(6000);
	 
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "helu@gmail.com", "a" },
      new Object[] { "kkki@gmail.com", "b" },
      new Object[] {"hssksl@gmail","c"},
    };
  }
}
