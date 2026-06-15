package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.*;

public class RegistrationPage {
	WebDriver driver;
	public RegistrationPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(linkText="Register") WebElement registerLink;
	
	@FindBy(id="customer.firstName")
	WebElement firstName;
	
	@FindBy(id="customer.lastName")
	WebElement lastName;
	
	@FindBy(id="customer.address.street")
	WebElement address;
	
	@FindBy(id="customer.address.city")
	WebElement city;
	
	@FindBy(id="customer.address.state")
	WebElement state;
	@FindBy(id="customer.address.zipCode")
	WebElement zipCode;
	
	@FindBy(id="customer.phoneNumber")
	WebElement phone;
	@FindBy(id="customer.ssn")
	WebElement ssn;
	@FindBy(id="customer.username")
	WebElement username;
	@FindBy(id="customer.password")
	WebElement password;
	@FindBy(id="repeatedPassword")
	WebElement confirmPassword;
	@FindBy(xpath="//input[@value='Register']")
	WebElement registerBtn;
	
	public String registerUser() {

	    String userName = "hema" + System.currentTimeMillis();

	    registerLink.click();

	    firstName.sendKeys("Hema");
	    lastName.sendKeys("Test");
	    address.sendKeys("Hyderabad");
	    city.sendKeys("Hyderabad");
	    state.sendKeys("TS");
	    zipCode.sendKeys("500001");
	    phone.sendKeys("9999999999");
	    ssn.sendKeys("123456");

	    username.sendKeys(userName);
	    password.sendKeys("admin123");
	    confirmPassword.sendKeys("admin123");

	    registerBtn.click();

	    return userName;
	}
		
	}
	


