package smarttech.ny.TestNGChallenges;

import org.testng.annotations.Test;

public class EnabledTrueFalse {
	@Test(enabled = true)
	public void getTestEnable1() {
		System.out.println("Test Enable 1");
	}

	@Test(enabled = false)
	public void getTestEnable2() {
		System.out.println("Test Enable 2");
	}

	@Test(enabled = true)
	public void getTestEnable3() {
		System.out.println("Test Enable 3");
	}

	@Test(enabled = true)
	public void getTestEnable4() {
		System.out.println("Test Enable 4");
	}

	@Test(enabled = false)
	public void getTestEnable5() {
		System.out.println("Test Enable 5");
	}
}
