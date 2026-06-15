package testcases;

import utilities.WaitUtils;
import org.testng.annotations.*;
import base.BaseTest;
import pages.BillPayPage;
import pages.LoginPage;
import utilities.TestData;
public class BillPaymentTest extends BaseTest {
	@Test(priority=4)
	public void billPayTest() throws InterruptedException {
		System.out.println(TestData.username);
		System.out.println(TestData.password);
		LoginPage lp=new LoginPage(driver);
		//lp.login("hema123", "admin123");
		
		lp.login(TestData.username, TestData.password);
		WaitUtils.pause(5);
		BillPayPage bp=new BillPayPage(driver);
		bp.payBill();
		WaitUtils.pause(4);
		System.out.println("Bill payment successful");
	}

}
