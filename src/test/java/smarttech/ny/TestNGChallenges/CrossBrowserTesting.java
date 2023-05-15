package smarttech.ny.TestNGChallenges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {
	WebDriver driver;

	@BeforeMethod
	@Parameters("Browser")
	public void initialization(String browser) {

		if (browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			System.out.println("Execute Chrome Browser");
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			System.out.println("Execute Edge Browser");

			driver = new EdgeDriver();

		} else if (browser.equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			System.out.println("Execute  FireFox Browser");

			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("Opera")) {
			WebDriverManager.operadriver().setup();
			System.out.println("Execute Opera Browser");

			driver = new OperaDriver();
		}
	}

	@Test
	public void getLogIn() {
		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("tanvirpatwary16@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Tester01");	
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		driver.manage().window().maximize();
		//System.out.println("LogIn the application"); 
	}

	@AfterMethod
	public void getCloseBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
		System.out.println("Browser closed");
	}

}
