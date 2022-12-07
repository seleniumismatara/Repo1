package automation_code_16thnov_2022;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*selenium is test suite
 * testNG-is anexecution engine is also a reporting system alsohelps in parallel excution alsohelps inbatch running of files
 * also helps in batch running of files alsohelps in group running.customizes your test cases and its execution */

public class Execution_priorities {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Testing@beforeSuite annotation");

	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Testing@BeforeSuite annotation");

	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Testing@BeforeClass annotation");

	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Testing@BeforeMethod annotation");
	}

	@Test
	public void testcase() {
		System.out.println("My code is work fine");
	}

	@AfterSuite
	public void aftersuite() {
		System.out.println("Testing @AfterTest annotation");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("testing@Aftertest annotation");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Testing@After annotation");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Testing@AfterMethod annotation");
	}
}
