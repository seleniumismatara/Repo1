package automation_code_16thnov_2022;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tricombo {
	public static WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("this is beforeMethod executing");

	}

	@Test
	public void testcase1() {
		driver.get("https://amazon .com");
		System.out.println("Test case Amazon");
	}

	@Test
	public void testcase2() {
		driver.get("https://google.com");
		System.out.println("test case google");

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("This is after Method annotation");
		driver.quit();
	}
}
