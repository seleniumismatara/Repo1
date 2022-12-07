package testing_code_16thnov_2022;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Assertion_IN_Testing {
	// Assertion-Assert and softAssert

	@Test(priority = 1)
	public void program() {
		System.out.println("we ara learning java");
		Assert.assertTrue(true);// as long as assertionis passing,the control willmove on
		System.out.println(2 + 3);
		Assert.assertTrue(1 > 2);
		System.out.println("Learning Selenium");

	}

	@Test(priority = 2)
	public void login() {
		System.out.println("Hello world");
	}

}