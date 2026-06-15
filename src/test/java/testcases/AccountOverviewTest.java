package testcases;

import utilities.WaitUtils;
import org.testng.annotations.*;
import base.BaseTest;
import junit.framework.Assert;
import pages.AccountOverviewPage;
import pages.LoginPage;
import utilities.TestData;
public class AccountOverviewTest extends BaseTest {
	@Test(priority=5)
	public void verifyAccountOverview() throws InterruptedException{
		System.out.println(TestData.username);
		System.out.println(TestData.password);
		LoginPage lp=new LoginPage(driver);
		//lp.login("hema123", "admin123");
		lp.login(TestData.username, TestData.password);
		
		WaitUtils.pause(5);
		AccountOverviewPage ap=new AccountOverviewPage(driver);
		
		ap.clickAccountOverview();
		
		WaitUtils.pause(6);
		Assert.assertTrue(driver.getPageSource().contains("Account details")|| driver.getPageSource().contains("Balance"));
		
	}

}
