package DevOpsAssignment.SecondAssignment.utilities;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;

import io.cucumber.java.Scenario;

public class BaseTestClass {
	public static WebDriver driver;
	
	public void openBrowser(String browser,String url) {
		try {
			if(browser.equals("Chrome")) {
				/*
				 * ChromeOptions chromeOptions = new ChromeOptions();
				 * WebDriverManager.chromedriver().setup(); driver = new
				 * ChromeDriver(chromeOptions);
				 */
				driver=new ChromeDriver();
			}
			else if(browser.equals("Edge")) {
				/*
				 * EdgeOptions edgeOptions=new EdgeOptions();
				 * WebDriverManager.edgedriver().setup(); driver = new EdgeDriver(edgeOptions);
				 */
			}
			//Navigate to the website
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

			//Need of thread.sleep() functionality, in case of loading page or waiting for search results
			Thread.sleep(3000);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public void closeBrowser() {
		driver.quit();
	}

	public WebDriver getDriver() {
		return driver;
	}
	
	public void enterText(String text,WebElement element) {
		element.sendKeys(text);
		
		
	}
	
	public void clickOnElement(WebElement element) {
		element.click();
	}
	
	public boolean validateElementPresent(WebElement element) {
		try {
			return element.isDisplayed();
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}
	
	public void threadWait(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void takeScreenshot(Scenario sc) {
		TakesScreenshot ss=(TakesScreenshot)driver;
		byte[] image=ss.getScreenshotAs(OutputType.BYTES);
		sc.attach(image, "image/png", "Screenshot");
		
	}
	
	
	
	

}
