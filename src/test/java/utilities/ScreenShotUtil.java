package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

public class ScreenShotUtil {
	public static void takeScreenshot(WebDriver driver, String fileName) throws IOException{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\sravani\\OneDrive\\Pictures\\Screenshots"+fileName+".png");
		FileUtils.copyFile(src, dest);
		System.out.println("From screenshots filename is : "+fileName);
	}
	

}
