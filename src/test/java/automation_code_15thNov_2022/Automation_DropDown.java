package automation_code_15thNov_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation_DropDown {

	public static WebDriver driver;
	public static Select select;
	public static ChromeOptions option;

	public static void main(String[] args) {
		option = new ChromeOptions();
		option.addArguments("--incognito");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//div[@id = 'reg_pages_msg']/preceding::a[1]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		driver.findElement(By.name("lastname")).sendKeys("Panda");
		driver.findElement(By.name("reg_email--")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.name("reg_email_confirmation--")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Selenium@123");
		// you have to create the object of select class

		select = new Select(driver.findElement(By.id("month")));
		// select.selectByIndex()-do not use this
		// select.selectByvalue()-do not use that
		select.selectByVisibleText("may");

		select = new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("30");

		select = new Select(driver.findElement(By.id("year")));
		select.selectByVisibleText("1990");

	}

}
