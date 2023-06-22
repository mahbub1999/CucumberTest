package javaadvancedcoding.collections;

import org.testng.annotations.Test;

public class BreakAndContinuePractice {
//@Test
	public void getBreak() {
		for (int i = 0; i < 100; i++) {
			if (i == 10)
				break;
			System.out.println(i);
		}
	}

	@Test
	public void getContinue() {
		for (int i = 0; i < 100; i++) {
			if (i == 10)
				continue;
			System.out.println(i);
		}
	}

}
