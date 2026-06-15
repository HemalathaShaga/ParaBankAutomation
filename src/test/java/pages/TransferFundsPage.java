package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
public class TransferFundsPage {
	WebDriver driver;
	public TransferFundsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Transfer Funds")
	WebElement transferFunds;
	@FindBy(id="amount")
	WebElement amount;
	@FindBy(xpath="//input[@value='Transfer']")
	WebElement transferBtn;
	
	public void transferMoney(String amt) {
		transferFunds.click();
		amount.sendKeys(amt);
		
		transferBtn.click();
	}

}
