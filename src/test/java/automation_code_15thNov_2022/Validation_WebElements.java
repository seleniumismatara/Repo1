package automation_code_15thNov_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validation_WebElements {
	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		WebElement usernametextBox = driver.findElement(By.id("login1"));
		System.out.println(usernametextBox.isDisplayed());
		System.out.println(usernametextBox.isEnabled());
		System.out.println(usernametextBox.isSelected());

		WebElement usernameBox;
		if (usernametextBox.isDisplayed() && usernametextBox.isEnabled()) {
			usernametextBox.sendKeys("seleniumpanda@rediffmail.com");
		} else {
			System.out.println("username textbox is not working");
		}
		;
	}

}
