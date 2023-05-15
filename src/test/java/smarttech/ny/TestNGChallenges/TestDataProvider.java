package smarttech.ny.TestNGChallenges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDataProvider {
	WebDriver driver;
		
	@DataProvider(name = "Authentication")
	public static Object[][] credentials() {
		return new Object[][] { { "tanvirpatwary16@gmail.com", "Tester01" },
											{ "tanvirpatwary16@gmail.com", "Tester001" }, 
											{ "tanvirpatwary16@gmail.com", "Tester000" },
											{ "Tanvodidfoif@gmail.com", "tester454" } };

	}
	
	@Test (dataProvider = "Authentication")
	public void getLogIn(String UserName, String Password) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://automationexercise.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@type='email'])[1]")).sendKeys("UserName");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Password");
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		
	}
}
