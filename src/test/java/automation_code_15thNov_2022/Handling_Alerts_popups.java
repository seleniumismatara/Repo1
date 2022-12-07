package automation_code_15thNov_2022;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_Alerts_popups {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		// Alert is interface.it is not a class -tricky interview question
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("test of the alert is:" + text);

		if (text.equals("Please enter a valid user name")) {

			Thread.sleep(2000);
			alert.accept();

		} else {
			alert.dismiss();

		}
		Thread.sleep(2000);
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
	}
}
