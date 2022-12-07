package automation_code_16thnov_2022;

import org.testng.annotations.Test;

public class Priority_Avalue {
	@Test(priority = 2)
	public void tc1() {
		System.out.println("test case 1");

	}

	@Test(priority = 3)
	public void tc2() {
		System.out.println("test case 2");
	}

	@Test(priority = 1)
	public void tc3() {
		System.out.println("test case 3");
	}

	@Test(priority = 5)
	public void tc4() {
		System.out.println("test case4");
	}

	@Test(priority = 4)
	public void tc5() {
		System.out.println("test case 5");
	}

}
