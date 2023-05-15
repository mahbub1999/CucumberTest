package smarttech.ny.TestNGChallenges;

import org.testng.annotations.Test;

public class DependsOnMethod {
	@Test
	public void getOpenBrowser() {
		System.out.println("Open Browser");
	}

	@Test(dependsOnMethods = "getOpenBrowser")
	public void getLogIn() {
		System.out.println("LogIn Browser");
	}

	@Test(dependsOnMethods = "getLogIn")
	public void getCloseBrowser() {
		System.out.println("Close Browser");
	}

}
