package DevOpsAssignment.SecondAssignment.stepDefinition;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {
	WebDriver driver;

	@Given("^Navigate to the \"([^\"]*)\" website in (.+) browser$")
	public void navigate_to_the_something_website_in_browser(String url, String browser) throws Throwable {
		
		int intialTime=LocalDateTime.now().getMinute();
		

		//Can same selenium test work in different browsers (chrome or IE)
		if(browser.equals("Chrome")) {
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.setHeadless(true);
			WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\prdp1\\.m2\\repository\\webdriver\\chromedriver\\win32\\106.0.5249.61\\chromedriver.exe");
			driver = new ChromeDriver(chromeOptions);
		}
		else if(browser.equals("Edge")) {
			EdgeOptions edgeOptions=new EdgeOptions();
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver(edgeOptions);
		}
		
		try {
			//Navigate to the website
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

			//Need of thread.sleep() functionality, in case of loading page or waiting for search results
			Thread.sleep(3000);


			//Login to the portal (login form can be on the different window, or as a dropdown, or as a pop-up)
			driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9494482457");
			driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("mpk.7099");
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();

			//Need of thread.sleep() functionality, in case of loading page or waiting for search results
			Thread.sleep(3000);

			//Showcase interaction with the Dynamic and Static elements
			driver.findElement(By.xpath("//input[contains(@title,'Search')]")).sendKeys("Laptops");
			driver.findElement(By.className("L0Z3Pu")).click();

			//Need of thread.sleep() functionality, in case of loading page or waiting for search results
			Thread.sleep(3000);
			
			//Extract web elements such as table or list
			List<WebElement> table=driver.findElements(By.xpath("//div[@data-id]"));
			for (WebElement webElement : table) {
				System.out.println(webElement.getText());
			}
			
			//Usage of locator types, whether to use CSS selector or Xpath
			int cssLocatorInitialTime=LocalDateTime.now().getNano();
			driver.findElement(By.cssSelector("input._3704LK")).sendKeys("Mobiles");
			driver.findElement(By.cssSelector("button.L0Z3Pu")).click();
			int cssLocatorFinalTime=LocalDateTime.now().getNano();
			
			int xpathInitialTime=LocalDateTime.now().getNano();
			driver.findElement(By.xpath("//input[contains(@title,'Search')]")).sendKeys("Mobiles");
			driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
			int xpathFinalTime=LocalDateTime.now().getNano();
			
			//How above variation effects performance of the testing
			int cssTime=cssLocatorFinalTime-cssLocatorInitialTime;
			int xpathTime=xpathFinalTime-xpathInitialTime;
			
			if(cssTime<xpathTime) System.out.println("CSS selector has more performance than Xpath");
			else System.out.println("Xpath has more performance than Css selector");
			
			//Usage of Dynamic Xpath or tags vs Static Xpath
			driver.findElement(By.xpath("//input[contains(@title,'Search')]")).sendKeys("Cameras");
			driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		} catch (NoSuchElementException | NoSuchWindowException | StaleElementReferenceException | TimeoutException e) {
			//Exception handling in case webpage doesn’t load properly as expected
			e.printStackTrace();
		}

		
		
		driver.quit();
		
		int finalTime=LocalDateTime.now().getMinute();
		
		//Bonus point: Measure the performance in terms of time investment for Manual Vs Automated Testing
		int manualEffortInMinutes=2;
		int automatedTestingEffort=finalTime-intialTime;
		
		if(automatedTestingEffort<manualEffortInMinutes) System.out.println("Automated Testing has more performance than Manual testing");
		else System.out.println("Manual Testing has more performance than Automated testing");
	}


}
