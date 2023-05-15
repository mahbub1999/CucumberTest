package smarttech.ny.TestNGChallenges;

import org.testng.annotations.Test;

public class PriorityTest {
	@Test(priority = 2)
	public void getMethod1() {
		System.out.println("print getMethod1");
	}
@Test(priority = 5)	
public void getMethod2() {
		System.out.println("print getMethod2");
	}
@Test(priority = 1)
public void getMethod3() {
		System.out.println("print getMethod3");
	}
@Test(priority = 4)	
public void getMethod4() {
		System.out.println("print getMethod4");
	}
@Test(priority = 0)
	public void getMethod5() {
		System.out.println("print getMethod5");
	}

}
