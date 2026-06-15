package testcases;

import org.testng.annotations.*;
import base.BaseTest;
import pages.LoginPage;
import pages.TransferFundsPage;
import utilities.TestData;
import utilities.WaitUtils;
public class TransferFundsTest extends BaseTest {
	@Test(priority=3)
	public void transferFundTest() throws InterruptedException{
		System.out.println(TestData.username);
		System.out.println(TestData.password);
		LoginPage lp=new LoginPage(driver);
		//lp.login("hema123", "admin123");
		lp.login(TestData.username, TestData.password);
		TransferFundsPage tf=new TransferFundsPage(driver);
		tf.transferMoney("500");
		WaitUtils.pause(5);
		System.out.println("Transfer Completed");
		
	}

}
