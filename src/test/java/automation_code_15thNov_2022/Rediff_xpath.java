package automation_code_15thNov_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_xpath {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//a[contain@class,'Signin')]")).click();
		driver.findElement(By.xpath("//input[contains@id,'login1')]")).sendKeys("Seleniumpanda@rediffmail.com)");
		driver.findElement(By.xpath("//input[contains@id,'password'")).sendKeys("Selenium@123)");
		driver.findElement(By.xpath("//input[contains@id,'signinbtn'")).click();
		driver.findElement(By.xpath("//a[contains@id,'rd_logout')")).click();
		driver.findElement(By.xpath("//b[contains(test(),'Rediff HOME')]")).click();

		// html[contain(test(),'textcontent')]
		// html[contain@attribute,'value')]
		// seleniumpanda@rediffmail.com
		// selenium@123

	}

}
