package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.*;
import org.testng.annotations.*;
import base.BaseTest;
import junit.framework.Assert;
import pages.LoginPage;
import utilities.WaitUtils;
public class NegativeLoginTest extends BaseTest {
	@Test
	public void invalidLogin() throws InterruptedException{
		LoginPage lp=new LoginPage(driver);
		lp.login("Wronguser", "wrongpass");
		
		
		String text=driver.findElement(By.tagName("body")).getText();
		WaitUtils.pause(5);
		Assert.assertTrue(text.toLowerCase().contains("error"));
		//Assert.assertTrue(driver.getPageSource().contains("could not be verified")
				//|| driver.getPageSource().contains("Error"));
		//System.out.println("Negative test case Passed");
	}

}
