package automation_code_15thNov_2022;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validation {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		String actualCurrentUrl = "https://mail.rediff.com/cgi-bin/login.cgi";
		String expectedcurrentUrl = driver.getCurrentUrl();
		String actualTitle = "Rediffmail";
		String expectedTitle = driver.getTitle();
		if (actualCurrentUrl.equals(expectedcurrentUrl) && actualTitle.equals(expectedTitle)) {
			System.out.println("My url is correct");

		} else {
			System.out.println("My url is not correct");
		}

	}

}
