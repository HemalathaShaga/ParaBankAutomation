package testcases;

import utilities.WaitUtils;
import org.testng.annotations.*;
import base.BaseTest;
import pages.LoginPage;
import utilities.TestData;
public class LoginTest extends BaseTest{
	@Test(priority=2)
	public void verifyLogin() throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		//lp.login("hema123", "admin123");
		lp.login(TestData.username, TestData.password);
		
		WaitUtils.pause(5);
		System.out.println("Login Successfull as : "+TestData.username);
	}
	

}
