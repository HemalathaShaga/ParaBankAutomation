package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
public class AccountOverviewPage {
	WebDriver driver;
	public AccountOverviewPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Accounts Overview")
	WebElement accountsOverview;
	
	public void clickAccountOverview() {
		accountsOverview.click();
	}

}

