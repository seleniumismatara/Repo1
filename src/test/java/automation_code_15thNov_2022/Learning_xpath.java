package automation_code_15thNov_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learning_xpath {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://automationpractice.pl/index.php");
		driver.findElement(By.xpath("//a[@class = 'login']")).click();
		driver.findElement(By.xpath("//input[@id = 'email_create']")).sendKeys("helloworld232@gmail.com");
		driver.findElement(By.xpath("//button[@id = 'SubmitCreate']")).click();
		driver.findElement(By.xpath("//input@id='id_gender']"));
		driver.findElement(By.xpath("//input[@id = 'customer_firstname']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@id = 'customer_lastname']")).sendKeys("panda");
		driver.findElement(By.xpath("//input[@id = 'Passwd']")).sendKeys("Selenium@123");

	}

}
