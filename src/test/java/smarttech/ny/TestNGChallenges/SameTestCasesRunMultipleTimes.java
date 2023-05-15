package smarttech.ny.TestNGChallenges;

import org.testng.annotations.Test;

public class SameTestCasesRunMultipleTimes {
	
	@Test(invocationCount = 5)
	public void getMultipleTimesRunTestCases() {
		System.out.println("Multiple Times Run Test Cases");
	}
}
