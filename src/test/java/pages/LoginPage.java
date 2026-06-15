package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="username")
	WebElement username;
	@FindBy(name="password")
	WebElement password;
	@FindBy(xpath="//input[@value='Log In']")
	WebElement loginBtn;
	
	public void login(String user, String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);
		
		loginBtn.click();
	}

}
