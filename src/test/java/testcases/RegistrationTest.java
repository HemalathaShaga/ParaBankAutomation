package testcases;
import utilities.WaitUtils;
import org.testng.Assert;
 
import org.testng.annotations.*;
import base.BaseTest;
import pages.RegistrationPage;
import utilities.TestData;
import utilities.WaitUtils;
public class RegistrationTest extends BaseTest {
	@Test(priority=1)
	public void verifyUserRegistration() throws InterruptedException{
		RegistrationPage rp=new RegistrationPage(driver);
		String generatedUser=rp.registerUser();
		
		TestData.username=generatedUser;
		TestData.password="admin123";
		WaitUtils.pause(4);
		System.out.println("Created user = "+TestData.username);
		WaitUtils.pause(5);
		String actualTitle=driver.getPageSource();
		Assert.assertTrue(actualTitle.contains("Your account was created successfully"),"Registration Failed");
		
		System.out.println("User Registered Successfully");
	}

}
