package utilities;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class WaitUtils {
	WebDriver driver;
	public WaitUtils(WebDriver driver) {
		this.driver=driver;
		
	}
	public void waitForElement(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void pause(int seconds)  throws InterruptedException{
		Thread.sleep(seconds*1000);
	}

}
