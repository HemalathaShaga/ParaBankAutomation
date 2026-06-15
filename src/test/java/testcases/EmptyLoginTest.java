package testcases;

import org.testng.annotations.*;
import org.testng.asserts.*;
import base.BaseTest;
import junit.framework.Assert;
import pages.LoginPage;
public class EmptyLoginTest extends BaseTest {
	@Test
	public void emptyLoginTest() {
		LoginPage lp=new LoginPage(driver);
		lp.login(" ", " ");
		Assert.assertTrue(driver.getCurrentUrl().contains("index"));
		
		System.out.println("Empty Login Passed");
	}
	

}
