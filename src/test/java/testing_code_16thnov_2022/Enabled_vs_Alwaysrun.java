package testing_code_16thnov_2022;

import org.testng.annotations.Test;

public class Enabled_vs_Alwaysrun {

	@Test(priority = 1, alwaysRun = true)
	public void logic() {
		System.out.println("First logic");
	}

	@Test(priority = 2, dependsOnMethods = "logic1")
	public void logic2() {
		System.out.println("second logic");

	}

	@Test(priority = 3, dependsOnMethods = { "logic1", "logic2" })
	public void logic3() {
		System.out.println("third logic");
	}

}
