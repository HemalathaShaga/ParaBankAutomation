package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
public class BillPayPage {

	WebDriver driver;
	public BillPayPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Bill Pay')]")
	WebElement billPay;
	@FindBy(name="payee.name")
	WebElement payeename;
	@FindBy(name="amount")
	WebElement amount;
	@FindBy(xpath="//input[@value='Send Payment']")
	WebElement sendPayment;
	
	public void payBill() {
		billPay.click();
		payeename.sendKeys("Electricity");
		amount.sendKeys("100");
		sendPayment.click();
	}
}
