package automation_code_16thnov_2022;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency_operation {

	@Test()
	public void tc1() {
		System.out.println("test case 1");
		Assert.fail();
		// when you write your code because of some reason it will fail

	}

	@Test(dependsOnMethods = "tc1", alwaysRun = true)
	public void tc2() {
		System.out.println("test case 2");
	}

	@Test(dependsOnMethods = { "tc1", "tc2" })
	public void tc3() {
		System.out.println("test case 3");

	}

	@Test(dependsOnMethods = { "tc1", "tcl", "tcl3" })
	public void tc4() {
		System.out.println("test case4");

	}

}
