package javaadvancedcoding.collections;

import org.testng.annotations.Test;

public class BreakAndContinueStatement {
	// @Test
		public void getBreakTheLoop() {
			for (int i = 0; i < 100; i++) {
				if (i == 6)
					break;
				System.out.println(i);
			}

		}

		@Test
		public void getSkipTheValue() {
			for (int i = 0; i < 10; i++) {
				if (i == 6)
					continue;
				System.out.print(i);
			}
		}
	}
