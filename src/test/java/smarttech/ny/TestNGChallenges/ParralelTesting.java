package smarttech.ny.TestNGChallenges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParralelTesting {
	WebDriver driver;

	@Test
	public void smokeTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://automationexercise.com/login");
		driver.manage().window().maximize();
		System.out.println("Smoke Test");
	}

	@Test
	public void sanityTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://automationexercise.com/login");
		driver.manage().window().maximize();
		System.out.println("Sanity Test");
	}

	@Test
	public void regressionTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://automationexercise.com/login");
		driver.manage().window().maximize();
		System.out.println("Regression Test");
	}

	@Test
	public void functionalTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://automationexercise.com/login");
		driver.manage().window().maximize();
		System.out.println("Functional Test");
	}
}
