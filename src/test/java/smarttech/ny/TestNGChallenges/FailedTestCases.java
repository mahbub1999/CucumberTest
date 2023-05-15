package smarttech.ny.TestNGChallenges;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTestCases {
	@Test
	public void getTest1() {
		Assert.assertTrue(true);
		System.out.println("getTest1");
	}

	@Test
	public void getTest2() {
		Assert.assertTrue(true);

		System.out.println("getTest2");

	}

	@Test
	public void getTest3() {
		Assert.assertTrue(false);

		System.out.println("getTest3");

	}

	@Test
	public void getTest4() {
		Assert.assertTrue(false);

		System.out.println("getTest4");

	}

	@Test
	public void getTest5() {
		Assert.assertTrue(false);

		System.out.println("getTest5");

	}

}
