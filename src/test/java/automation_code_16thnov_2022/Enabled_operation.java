package automation_code_16thnov_2022;

import org.testng.annotations.Test;

public class Enabled_operation {
	@Test(priority = 2, enabled = true)
	public void tc1() {
		System.out.println("test case 1");

	}

	@Test(priority = 3)
	public void tc2() {
		System.out.println("Test case 3");
	}

	@Test(priority = 1)
	public void tc3() {
		System.out.println("Test case 4");

	}

	@Test(priority = 4, invocationCount = 5)
	public void tc5() {
		System.out.println("Test case 5");
	}

}
