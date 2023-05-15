package smarttech.ny.TestNGChallenges;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicAnnotation {
	@BeforeSuite
	public void getBeforeSuite() {
		System.out.println("Run getBeforeSuite#1");

	}

	@BeforeTest
	public void getBeforeTest() {
		System.out.println("Run getBeforeTest#2");

	}

	@BeforeClass
	public void getBeforeClass() {
		System.out.println("Run getBeforeClass#3");

	}

	@BeforeMethod
	public void getBeforeMethod() {
		System.out.println("Run getBeforeMethod#4");

	}

	@Test
	public void getTest() {
		System.out.println("Run getTest");

	}

	@AfterMethod
	public void getAfterMethod() {
		System.out.println("Run getAfterMethod#4");

	}

	@AfterClass
	public void getAfterClass() {
		System.out.println("Run getAfterClass#3");

	}

	@AfterTest
	public void getAfterTest() {
		System.out.println("Run getAfterTest#2");

	}

	@AfterSuite
	public void getAfterSuite() {
		System.out.println("Run getAfterSuite#1");

	}
}
