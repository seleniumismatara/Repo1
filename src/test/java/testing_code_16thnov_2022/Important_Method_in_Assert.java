package testing_code_16thnov_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Important_Method_in_Assert {
	public static WebDriver driver;

	@Test
	public void logic() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		// use assertion for each webElement
		Assert.assertTrue(((WebElement) driver.findElements(By.className("signin"))).isEnabled());
		driver.findElement(By.className("signin")).click();
		String currentTitle = driver.getTitle();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(driver.getTitle());// Redifmail
		System.out.println(driver.getCurrentUrl());// https//mail.rediff.com/cgi-bin/login.cgi

		Assert.assertEquals(currentTitle, "Rediffmail");
		Assert.assertEquals(currentUrl, "https://mail.rediff.com/cgi-bin/login.cgi");

		WebElement password = driver.findElement(By.id("password"));
		Assert.assertTrue(password.isEnabled());
		password.sendKeys("Selenium@123");

		/*
		 * *Assert.asserttrue(false); Assert.assertEquals(false,null);
		 * Assert.assertNotEquals(null,null); Assert.assertFalse(false); Assert.fail();
		 */

	}
}
